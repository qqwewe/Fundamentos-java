package org.example.TP2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = ThreadLocalRandom.current().nextInt(0, 101);
        int chute;
        System.out.println("Tente adivinhar um número de 1 a 100 até acertar!");
        do{
            System.out.print("Digite um número: ");
            chute = sc.nextInt();
            if(chute>numero){
                System.out.println("O seu chute foi maior do que o número!");
                continue;
            }
            System.out.println("O seu chute foi menor do que o número!");
        }while (chute!=numero);
        System.out.println("Acertou!");
        sc.close();
    }
}
