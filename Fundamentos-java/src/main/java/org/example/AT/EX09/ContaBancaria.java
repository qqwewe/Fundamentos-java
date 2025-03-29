package org.example.AT.EX09;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if(deposito<=0){
            System.out.println("Digite um valor positivo e maior do que 0");
            return;
        }
        saldo+=deposito;
    }

    public void sacar(double saque){
        if(saque<=0){
            System.out.println("Digite um valor positivo e maior do que 0");
            return;
        } else if(saque > saldo){
            System.out.println("Saldo insuficiente para realizar o saque");
            System.out.println("Saldo Atual: R$" + saldo);
            return;
        }
        saldo-=saque;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$"+saldo);
    }
}
