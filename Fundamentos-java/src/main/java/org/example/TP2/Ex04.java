package org.example.TP2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento:");
        System.out.print("Dia: ");
        int dia = sc.nextInt();

        System.out.print("Mês: ");
        int mes = sc.nextInt();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        long diasDeVida = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Você tem " + diasDeVida + " dias de vida.");

        sc.close();
    }
}
