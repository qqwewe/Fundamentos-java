package org.example.AT.EX10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            FileWriter fileWriter = new FileWriter("compras.txt");

            for(int i=0; i<3; i++){
                System.out.println("Digite o nome do produto comprado: ");
                String nome = sc.nextLine();

                System.out.println("Digite a quantidade comprada: ");
                int quantidade = Integer.parseInt(sc.nextLine());

                System.out.println("Digite o preço unitário do produto: ");
                double preco = Double.parseDouble(sc.nextLine().replace(",","."));

                fileWriter.write("============"+"Produto "+(i+1)+"============" + "\nProduto: "+nome +"\nQuantidade: "+quantidade+"\nPreço unitário: R$"+preco +"\n");
            }

            fileWriter.close();

            BufferedReader br = new BufferedReader(new FileReader("compras.txt"));
            String linha;

            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}