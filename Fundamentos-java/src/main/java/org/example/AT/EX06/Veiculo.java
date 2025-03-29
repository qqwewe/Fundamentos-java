package org.example.AT.EX06;

public class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double quilometragem;

    public void exibirDetalhes(){
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano de fabricação: " +anoDeFabricacao);
        System.out.println("Quilometragem: " +quilometragem +"KM");
    }

    public void registrarViagem(double km){
        quilometragem+=km;
    }

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.quilometragem = 33576;
        veiculo1.anoDeFabricacao = 1986;
        veiculo1.modelo = "Fiat Uno";
        veiculo1.placa = "ABC12345";

        Veiculo veiculo2 = new Veiculo();
        veiculo2.quilometragem = 0;
        veiculo2.anoDeFabricacao = 2020;
        veiculo2.modelo = "Jeep Renegade";
        veiculo2.placa = "ABC54321";

        veiculo1.exibirDetalhes();
        System.out.println("============================");
        veiculo2.exibirDetalhes();

        System.out.println("\n==============Atualizado==============\n");

        veiculo1.registrarViagem(200.5);
        veiculo2.registrarViagem(1800);

        veiculo1.exibirDetalhes();
        System.out.println("============================");
        veiculo2.exibirDetalhes();
    }
}
