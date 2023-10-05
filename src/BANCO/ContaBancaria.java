package BANCO;

public class ContaBancaria {
    private double saldo;

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso. Seu novo saldo é: " + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso. Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}

