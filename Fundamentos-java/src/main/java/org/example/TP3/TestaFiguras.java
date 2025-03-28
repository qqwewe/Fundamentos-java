package org.example.TP3;

import java.text.DecimalFormat;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;

        double areaCirculo = circulo.calcularArea();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Área do círculo (raio 3.0): " + decimalFormat.format(areaCirculo));

        Esfera esfera = new Esfera();
        esfera.raio = 5.0;

        double volumeEsfera = esfera.calcularVolume();
        System.out.println("Volume da esfera (raio 5.0): " + decimalFormat.format(volumeEsfera));
    }
}
