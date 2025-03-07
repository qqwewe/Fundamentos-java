package org.example.TP2;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        String confirmacaoSenha;

        do{
            System.out.print("Confirme a senha digitada: ");
            confirmacaoSenha = sc.nextLine();
        }while(!senha.equals(confirmacaoSenha));

        System.out.println("senha confirmada!");
        sc.close();
    }
}
