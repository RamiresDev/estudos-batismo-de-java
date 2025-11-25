package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria{
    double desconto;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        desconto = valor * 0.01;
        valor = valor - desconto;
        System.out.println("Você depositou R$"+valor+" na conta poupança.");
        saldo +=valor;
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }
}
