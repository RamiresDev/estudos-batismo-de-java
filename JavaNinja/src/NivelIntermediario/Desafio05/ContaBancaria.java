package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta {
    public double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
