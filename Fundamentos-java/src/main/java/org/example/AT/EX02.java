package org.example.AT;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();


        while(true){
            String caracteresEspeciais = "@#$%^&+=!().*?-";
            Boolean capitalizada = false;
            Boolean numero = false;
            Boolean caracterEspecial = false;
            Boolean maiorQue8 = senha.length() > 8;

            for(char letra : senha.toCharArray()){
                if(Character.isUpperCase(letra)){
                    capitalizada = true;
                } else if(Character.isDigit(letra)){
                    numero = true;
                } else if(caracteresEspeciais.indexOf(letra) != -1){
                    caracterEspecial = true;
                }
            }
            if(maiorQue8 && capitalizada == numero && numero == caracterEspecial && capitalizada){
                break;
            } else{
                System.out.println("Digite uma nova senha seguindo as regras abaixo: ");
                if(senha.length()<8){
                    System.out.println("senha deve conter pelo menos 8 caracteres");
                }
                if(!capitalizada){
                    System.out.println("senha deve conter pelo menos uma letra maiúscula");
                }
                if(!numero){
                    System.out.println("senha deve conter pelo menos um número");
                }
                if(!caracterEspecial){
                    System.out.println("senha deve conter pelo menos um caracter especial (EX: " + caracteresEspeciais + ")");
                }
                senha = sc.nextLine();
            }
        }
        System.out.println("Senha válida!");
    }
}