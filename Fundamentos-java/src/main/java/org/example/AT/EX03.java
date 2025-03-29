package org.example.AT;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário mensal");
        Double salario = sc.nextDouble();

        Double salarioAnual = salario;
        DecimalFormat df = new DecimalFormat("0.00");

        if(salarioAnual <= 22847.76){
            System.out.println("Você vai pagar R$" + df.format(salarioAnual*0) + " reais de imposto");
            System.out.println("Seu salário líquido é de R$" + df.format(salarioAnual));
        } else if(salarioAnual <= 33919.80){
            System.out.println("Você vai pagar R$" + df.format(salarioAnual*0.075) + " reais de imposto");
            System.out.println("Seu salário líquido é de R$" + df.format(salarioAnual*(1-0.075)));
        } else if(salarioAnual <= 45012.60){
            System.out.println("Você vai pagar R$" + df.format(salarioAnual*0.15) + " reais de imposto");
            System.out.println("Seu salário líquido é de R$" + df.format(salarioAnual*(1-0.15)));
        }else{
            System.out.println("Você vai pagar R$" + df.format(salarioAnual*0.275) + " reais de imposto");
            System.out.println("Seu salário líquido é de R$" + df.format(salarioAnual*(1-0.275)));
        }
    }
}
