package org.example.TP2;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: R$");
        Double salario = sc.nextDouble();

        if(salario >= 50000){
            System.out.println("seu imposto de renda é de R$ " + salario*(0.225));
            System.out.println("Seu salário líquido é de R$ " + salario*(1-0.225));
        } else if (salario >= 25000){
            System.out.println("seu imposto de renda é de R$ " + salario*(0.15));
            System.out.println("Seu salário líquido é de R$ " + salario*(1-0.15));
        } else {
            System.out.println("seu imposto de renda é de R$ " + salario);
            System.out.println("Seu salário líquido é de R$ " + salario);
        }

        sc.close();
    }
}
