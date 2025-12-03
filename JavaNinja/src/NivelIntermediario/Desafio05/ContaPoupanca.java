package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
        this.tipoConta = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("Valor nulo ou negativo, insira um valor positivo !! ");
        } else {
            desconto = valor * 0.01;
            valor = valor - desconto;
            System.out.println("Você depositou R$"+valor+" na conta poupança.");
            saldo +=valor;
        }
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }
}
