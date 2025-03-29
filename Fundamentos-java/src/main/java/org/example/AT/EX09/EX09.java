package org.example.AT.EX09;

public class EX09 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Carlos";
        contaBancaria.setSaldo(0);

        contaBancaria.exibirSaldo();

        contaBancaria.depositar(-100);
        contaBancaria.depositar(1000);

        contaBancaria.exibirSaldo();

        contaBancaria.sacar(1001);
        contaBancaria.sacar(500);

        contaBancaria.exibirSaldo();
    }
}
