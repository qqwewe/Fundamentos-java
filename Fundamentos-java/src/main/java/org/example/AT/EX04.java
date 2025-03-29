package org.example.AT;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do empréstimo desejado: ");
        Double emprestimo = sc.nextDouble();

        System.out.println("Digite a quantidade de vezes em que deseja parcelar (min=6, max=48)");
        sc.nextLine();
        Integer parcelas = sc.nextInt();

        while (parcelas < 6 || parcelas > 48){
            System.out.println("Digite um valor de parcelas entre 6 e 48: ");
            parcelas = sc.nextInt();
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Valor total pago R$" + df.format(emprestimo*Math.pow(1.03, parcelas)));
        System.out.println("Valor da parcela R$" + df.format((emprestimo*Math.pow(1.03, parcelas))/parcelas));
    }
}