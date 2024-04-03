import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, ContaBancaria> contas;
    private int proximoNumeroConta;

    public Banco() {
        contas = new HashMap<>();
        proximoNumeroConta = 100000; // Iniciar com 100000 para garantir números de 6 dígitos e ir acrescentando mais um numero a cada usuario.
    }

    public int criarConta(String nomeTitular) {
        int numeroConta = proximoNumeroConta;
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);
        contas.put(numeroConta, conta);
        proximoNumeroConta++;
        return numeroConta;
    }

    public void realizarTransferencia(int numeroContaOrigem, int numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = contas.get(numeroContaOrigem);
        ContaBancaria contaDestino = contas.get(numeroContaDestino);

        if (contaOrigem == null || contaDestino == null) {
            System.out.println("Conta de origem ou destino não encontrada.");
            return;
        }

        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência bem-sucedida.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public ContaBancaria getConta(int numeroConta) {
        return contas.get(numeroConta);
    }
}
