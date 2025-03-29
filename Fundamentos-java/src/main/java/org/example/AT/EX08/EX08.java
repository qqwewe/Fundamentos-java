package org.example.AT.EX08;

public class EX08 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000.00);
        Estagiario estagiario = new Estagiario("Alberto", 1000.00);

        System.out.println("Salario do gerente é de: R$"+gerente.salarioBase);
        System.out.println("Salario do estagiario é de: R$"+estagiario.salarioBase);
    }
}
