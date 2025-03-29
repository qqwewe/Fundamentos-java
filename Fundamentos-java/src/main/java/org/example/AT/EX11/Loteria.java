package org.example.AT.EX11;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Integer acertos = 0;

        Set<Integer> sorteados = new HashSet<>();

        while (sorteados.size()!=6){
            sorteados.add(random.nextInt(60)+1);
        }

        System.out.println("Digite um número inteiro entre 1 e 61");
        for(int i = 0; i<6; i++){
            System.out.print("Numero "+(i+1)+": ");
            Integer chute = Integer.parseInt(sc.nextLine());

            if(sorteados.stream().anyMatch(numero -> numero.equals(chute))){
                acertos++;
            }
        }

        System.out.println("Você acertou conseguiu acertar " + acertos + " número(s)");

    }
}