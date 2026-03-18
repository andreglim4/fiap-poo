package br.com.fiapride.model;

public class Veiculo {
    private String placa;
    private String modelo;

    // O erro provavelmente está aqui!
    public Veiculo(String placa, String modelo) {
        this.placa = placa;   // 'this.placa' é o atributo da classe, 'placa' é o que veio do Main
        this.modelo = modelo; // O 'this' garante que o valor seja salvo no objeto
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
}