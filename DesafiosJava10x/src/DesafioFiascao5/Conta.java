package DesafioFiascao5;

public interface Conta {
    void consultarSaldo();
    void depositar(double valor);
    void depositar(double valor, double transferencia);
}
