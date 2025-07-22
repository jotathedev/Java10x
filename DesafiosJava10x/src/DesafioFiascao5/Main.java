package DesafioFiascao5;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- Conta Corrente ----------");
        ContaCorrente contaCorrente = new ContaCorrente("Luffy", 2000, TipoConta.CORRENTE);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(450, 100);

        System.out.println("---------- Conta Poupança ----------");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Sanji", 3000, TipoConta.POUPANCA);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(500, 200);
    }
}
