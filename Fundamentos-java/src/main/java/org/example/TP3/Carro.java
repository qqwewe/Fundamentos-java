package org.example.TP3;

public class Carro {

    String modelo;
    int velocidadeAtual;

    void acelerar(int valor) {
        velocidadeAtual += valor;
        System.out.println(modelo + " acelerou para " + velocidadeAtual + " km/h.");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Fiat Uno";
        carro1.velocidadeAtual = 0;

        carro1.acelerar(50);
    }
}
