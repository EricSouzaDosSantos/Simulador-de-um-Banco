public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        if (String.valueOf(numeroConta).length() != 6) {
            throw new IllegalArgumentException("O número da conta deve ter exatamente 6 dígitos.");
        }

        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 300.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
}
