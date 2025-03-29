package org.example.AT.EX07;

import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia(){
        return (nota1+nota2+nota3)/3;
    }

    public void verificarAprovacao(){
        double media = calcularMedia();
        System.out.println("Média: " + media);
        System.out.println("Aluno " + (media >= 7 ? "Aprovado" : "Repovrado"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite sua matricula: ");
        aluno.matricula = sc.nextLine();

        System.out.println("Digite sua primeira nota: ");
        aluno.nota1 = sc.nextInt();

        System.out.println("Digite sua segunda nota: ");
        aluno.nota2 = sc.nextInt();

        System.out.println("Digite sua terceira nota: ");
        aluno.nota3 = sc.nextInt();

        aluno.verificarAprovacao();
    }
}