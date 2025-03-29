package org.example.AT.EX12;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro usuário: ");
        String usuario1 = sc.nextLine();

        System.out.println("Digite o nome do segundo usuário: ");
        String usuario2 = sc.nextLine();

        ArrayList<String> historicoChat = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            String mensagem;
            if((i&1)!=1){
                System.out.print(usuario1+", digite sua mensagem: ");
                mensagem = sc.nextLine();
                mensagem = usuario1+": " + mensagem;
            }else{
                System.out.print(usuario2+", digite sua mensagem: ");
                mensagem = sc.nextLine();
                mensagem = usuario2+": " + mensagem;
            }
            historicoChat.add(mensagem);
        }
        System.out.println("===== Histórico de Mensagens =====");
        for(String mensagem : historicoChat){
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
    }
}
