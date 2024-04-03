import java.util.Scanner;

public class SimuladorBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo ao Banco Simulado!");
            System.out.println("1. Criar conta");
            System.out.println("2. Realizar transferência");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Digite o nome do titular da conta: ");
                    String nomeTitular = scanner.nextLine();
                    int numeroConta = banco.criarConta(nomeTitular);
                    System.out.println("Conta criada com sucesso. Número da conta: " + numeroConta);
                    break;
                case 2:
                    System.out.print("Número da conta de origem: ");
                    int origem = scanner.nextInt();
                    System.out.print("Número da conta de destino: ");
                    int destino = scanner.nextInt();
                    System.out.print("Valor da transferência: ");
                    double valor = scanner.nextDouble();
                    banco.realizarTransferencia(origem, destino, valor);
                    break;
                case 3:
                    System.out.print("Número da conta: ");
                    int numero = scanner.nextInt();
                    ContaBancaria conta = banco.getConta(numero);
                    if (conta != null) {
                        System.out.println("Saldo da conta " + numero + " (" + conta.getNomeTitular() + "): " + conta.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do Banco Simulado. Até a próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
