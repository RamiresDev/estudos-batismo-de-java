package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta {
    double saldo;
    double desconto;
    TipoConta tipoConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " conta " + tipoConta + " | novo saldo: "+ saldo;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void trade(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println("Não há saldo suficiente, seu saldo é: "+saldo);
        } else if (valor <= 0) {
            System.out.println("Valor nulo ou negativo !");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
