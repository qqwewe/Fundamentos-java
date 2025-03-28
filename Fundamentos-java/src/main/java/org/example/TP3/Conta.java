package org.example.TP3;

public class Conta {
    String titular;
    Integer numero;
    String agencia;
    Double saldo;
    String dataAbertura;

    void saca(double valor) {
        saldo = saldo - valor;
    }

    void deposita(double valor) {
        saldo = saldo + valor;
    }

    double calculaRendimento() {
        return saldo * 0.1;
    }
}
