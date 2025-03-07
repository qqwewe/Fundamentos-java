package org.example.TP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList();
        for(int i = 0; i<4; i++) {
            System.out.println("Digite a " + (i+1) + "º nota: ");
            notas.add(sc.nextDouble());
        }
        Double media = (notas.stream().mapToDouble(Double::doubleValue).sum())/4;
        System.out.println("Sua média foi de: " + media);
        if(media >= 7){
            System.out.println("Você foi aprovado!");
        } else if(media >= 5){
            System.out.println("Você está de recuperação");
        } else if (media < 5){
            System.out.println("Você foi reprovado");
        }
        sc.close();
    }
}
