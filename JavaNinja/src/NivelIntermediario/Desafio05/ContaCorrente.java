package NivelIntermediario.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Você depositou na conta corrente R$"+valor);
        saldo += valor;
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }
}
