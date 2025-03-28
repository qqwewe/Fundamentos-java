package org.example.TP3;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.titular = "João Silva";
        minhaConta.numero = 123456;
        minhaConta.agencia = "7890-1";
        minhaConta.saldo = 1000.0;
        minhaConta.dataAbertura = "28/03/2025";

        System.out.println("Conta bancária de: " + minhaConta.titular);
        System.out.println("Saldo inicial: R$ " + minhaConta.saldo);

        minhaConta.deposita(500.0);
        System.out.println("Saldo após depósito: R$ " + minhaConta.saldo);

        minhaConta.saca(200.0);
        System.out.println("Saldo após saque: R$ " + minhaConta.saldo);

        double rendimento = minhaConta.calculaRendimento();
        System.out.println("Rendimento mensal estimado (10%): R$ " + rendimento);

        double saldoFinal = minhaConta.saldo + rendimento;
        System.out.println("Saldo total com rendimento: R$ " + saldoFinal);
    }
}
