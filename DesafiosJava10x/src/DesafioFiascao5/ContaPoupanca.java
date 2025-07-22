package DesafioFiascao5;

public class ContaPoupanca extends ContaBancaria {
    TipoConta tipoConta;

    public ContaPoupanca(String nome, double saldo, TipoConta tipoConta) {
        super(nome, saldo);
        this.tipoConta = tipoConta;
    }

    public ContaPoupanca() {
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor*0.01);
        System.out.println("O depósito de R$" + valor + " foi realizado com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
    }

    @Override
    public void depositar(double valor, double transferencia) {
        saldo += valor - (valor*0.01);
        System.out.println("O depósito de R$" + valor + " foi realizado com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
        System.out.println("------------------------------------");
        saldo -= transferencia;
        System.out.println("A transferência de R$" + transferencia + " foi realizada com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
    }
}
