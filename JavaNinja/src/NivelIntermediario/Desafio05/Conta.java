package NivelIntermediario.Desafio05;

public interface Conta {
    double consultarSaldo();
    void depositar(double valor);
    void sacar(double valor);
    void  trade(double valor);
}
