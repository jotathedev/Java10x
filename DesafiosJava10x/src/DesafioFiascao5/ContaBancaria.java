package DesafioFiascao5;

public abstract class ContaBancaria implements Conta {
    String nome;
    double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Olá " + nome + "! Seu saldo é: R$" + saldo);
    }

    @Override
    public abstract void depositar(double valor);
    @Override
    public abstract void depositar(double valor, double transferencia);
}
