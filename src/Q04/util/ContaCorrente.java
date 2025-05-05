package Q04.util;

public class ContaCorrente {

    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if(valor > 1000){
            System.out.println("Não é permitido sacar mais de R$1000 por operação!");
        }
        else if(saldo < valor){
            System.out.println("Não tem saldo suficiente para o valor informado!");
        }
        else{
            saldo -= valor;
        }
    }

    public void depositar(float valor){
        saldo += valor;
        System.out.println(saldo);
    }

    public float consultarSaldo(){
        return saldo;
    }
}