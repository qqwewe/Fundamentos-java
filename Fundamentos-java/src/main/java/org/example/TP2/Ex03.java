package org.example.TP2;

import java.util.Scanner;

public class Ex03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Double valor;
        Double cambioDolar = 5.9;
        Double cambioEuro = 6.1;
        Double cambioLibra = 6.3;

        loop: while (true) {
            System.out.println("============Menu============");
            System.out.println("1. para conversão em dólar");
            System.out.println("2. conversão em Euro");
            System.out.println("3. conversão em Libras");
            System.out.println("0. Sair");
            System.out.println("============================");
            System.out.println("Digite o número da opção que deseja: ");
            switch (sc.nextInt()) {
                case 1:
                    valor = escolhaUmValor();
                    System.out.println("O valor em Dólares é: USD " + valor*cambioDolar);
                    break;
                case 2:
                    valor = escolhaUmValor();
                    System.out.println("O valor em Euros é: EUR " + valor*cambioEuro);
                    break;
                case 3:
                    valor = escolhaUmValor();
                    System.out.println("O valor em Libras é: LBR " + valor*cambioLibra);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break loop;
                default:
                    System.out.println("Digite um valor valido");
            }
        }
        sc.close();
    }

    public static Double escolhaUmValor(){
        System.out.println("Digite o valor em reais que deseja converter: ");
        Double valor = sc.nextDouble();
        return valor;
    }
}
