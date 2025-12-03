package NivelIntermediario.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
        this.tipoConta = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("Valor nulo ou negativo, insira um valor positivo !! ");
        } else {
            System.out.println("Você depositou na conta corrente R$" + valor);
            saldo += valor;
        }
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }
}
