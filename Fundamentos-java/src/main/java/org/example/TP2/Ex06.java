package org.example.TP2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        Integer ano = sc.nextInt();

        if(ano%400 == 0){
            System.out.println("O ano " + ano + " é bissexto!");
            sc.close();
            return;
        } else if(ano%4 == 0 && ano%100 != 0){
            System.out.println("O ano " + ano + " é bissexto!");
            sc.close();
            return;
        }
        System.out.println("O Ano " + ano + " não é bissexto");
        sc.close();
    }
}
