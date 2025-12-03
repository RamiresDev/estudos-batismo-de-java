package NivelIntermediario.Desafio05;

public class BancoKonoha {


    public void transferir(Conta contaOrigem, Conta contaDestino, double valor){
        if (contaOrigem.consultarSaldo() >= valor ) {
            contaOrigem.sacar(valor);
            contaDestino.trade(valor);
            System.out.println("Tranferência concluída da "+contaOrigem.toString()+" para a "+contaDestino.toString());
        } else {
            System.out.println("Não há saldo suficiente na conta de origem !!!, o saldo dela é: "+ contaOrigem.consultarSaldo());
        }
    }

    public void transferir(Conta[] contas, int indexOrigem, int indexDestino, double valor){
        transferir(contas[indexOrigem], contas[indexDestino], valor);
    }
}
