package org.example.TP2;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();
        double desconto = 0.0;

        if(valorCompra > 1000) {
            desconto = valorCompra * 0.10;
        } else if(valorCompra >= 500) {
            desconto = valorCompra * 0.05;
        }


        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorCompra - desconto);

        sc.close();
    }
}
