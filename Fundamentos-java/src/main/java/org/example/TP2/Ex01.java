package org.example.TP2;

import java.util.Scanner;

public class Ex01 {
    private String nomeUsuario;
    private String nomeMae;
    private String nomePai;
    private Integer idade;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();

        System.out.println("Digite o seu nome completo: ");
        ex01.setNomeUsuario(sc.next());

        System.out.println("Digite o sua idade em formato número (EX: 24)");
        ex01.setIdade(sc.nextInt());

        System.out.println("Digite o nome da sua mãe: ");
        ex01.setNomeMae(sc.next());

        System.out.println("Digite o nome do seu pai: ");
        ex01.setNomePai(sc.next());

        System.out.println("Nome do usuário: " + ex01.getNomeUsuario());
        System.out.println("Idade do usuário: " + ex01.getIdade());
        System.out.println("Nome do mae: " + ex01.getNomeMae());
        System.out.println("Nome do pai: " + ex01.getNomePai());
        System.out.println(ex01.getNomeUsuario().trim().length() > ex01.getNomeMae().trim().length() ?
                "Nome do usuário é maior do que o nome da mãe" :
                "Nome do usuário é menor ou igual do que o nome da mãe");

        sc.close();
    }
}
