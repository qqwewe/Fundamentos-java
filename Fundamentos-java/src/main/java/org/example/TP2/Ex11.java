package org.example.TP2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int incremento;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Digite o incremento: ");
        incremento = sc.nextInt();

        for(int i = num1; i<num2; i+=incremento){
            if(i+incremento>=num2){
                System.out.print(i);
                continue;
            }
            System.out.print(i+",");
        }
        sc.close();
    }
}
