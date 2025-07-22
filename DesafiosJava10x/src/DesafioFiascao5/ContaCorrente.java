package DesafioFiascao5;

public class ContaCorrente extends ContaBancaria {
    TipoConta tipoConta;

    public ContaCorrente(String nome, double saldo,TipoConta tipoConta) {
        super(nome, saldo);
        this.tipoConta = tipoConta;
    }

    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O depósito de R$" + valor + " foi realizado com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
    }

    @Override
    public void depositar(double valor, double transferencia) {
        saldo += valor;
        System.out.println("O depósito de R$" + valor + " foi realizado com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
        System.out.println("------------------------------------");
        saldo -= transferencia;
        System.out.println("A transferência de R$" + transferencia + " foi realizada com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);
    }
}
