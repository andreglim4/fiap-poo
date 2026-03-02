package br.com.fiapride.model;

// A Classe Projetor segue o modelo definido no seu diagrama UML
public class Projetor {
    private String material;
    private double pesoKg;
    private String tamanho;
    private boolean ligado; // Atributo auxiliar para controle de estado

    // Construtor para inicializar o objeto Projetor
    public Projetor(String material, double pesoKg, String tamanho) {
        this.material = material;
        this.pesoKg = pesoKg;
        this.tamanho = tamanho;
        this.ligado = false; // O projetor inicia desligado por padrão
    }

    // --- Operações de Lógica do Objeto ---

    public void ligarProjetor() {
        if (this.ligado) {
            System.out.println("Aviso: O projetor já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("Projetor ligado. Iniciando projeção...");
        }
    }

    public void desligarProjetor() {
        if (!this.ligado) {
            System.out.println("Aviso: O projetor já está desligado.");
        } else {
            this.ligado = false;
            System.out.println("Projetor desligado com segurança.");
        }
    }

    // Implementação da operation12() como uma funcionalidade real
    public void ajustarFoco() {
        if (this.ligado) {
            System.out.println("Ajustando o foco da lente para nitidez máxima.");
        } else {
            System.out.println("Erro: Ligue o projetor antes de ajustar o foco.");
        }
    }

    // --- Métodos de Acesso (Getters e Setters) ---

    public String getMaterial() {
        return this.material;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    // Set privado com regra de negócio para evitar pesos negativos
    private void setPesoKg(double peso) {
        if (peso > 0) {
            this.pesoKg = peso;
        } else {
            System.out.println("Erro: Peso do projetor deve ser maior que zero.");
        }
    }

    public String getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}