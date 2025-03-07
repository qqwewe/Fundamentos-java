package org.example.TP2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();


        int contadorDeEspaço = 0;
        for(char letra: frase.toCharArray()){
            if(" ".equalsIgnoreCase(String.valueOf(letra))){
                contadorDeEspaço++;
            }
            if(contadorDeEspaço==2){
                frase = frase.replaceAll("  ", " ");
                contadorDeEspaço = 0;
            }
        }

        String[] palavras = frase.split(" ");

        System.out.println("A frase tem "+ Arrays.stream(palavras).count()+ " palavras");
        sc.close();
    }
}
