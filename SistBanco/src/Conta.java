

public class Conta {
    private String titularConta;
    private String numeroConta;
    private double saldoConta;

    public Conta(String titularConta, String numeroConta, double saldoConta) {
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public void depositar(double valor){
        if (valor>0){
            saldoConta += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo:" + saldoConta);
        }  else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoConta);
        } else if (valor > saldoConta) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return saldoConta;
    }
}


