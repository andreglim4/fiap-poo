package br.com.fiapride.model;

public class Projetor {
    private String material;
    private double pesoKg;
    private String tamanho;
    private boolean ligado; // Adicionado: Atributo para controlar o estado

    // --- Operações de Lógica do Objeto ---

    public Projetor(String string, double d, String string2) {
		
	}

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

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0) { // Corrigido: Nome da variável de 'peso' para 'pesoKg'
            this.pesoKg = pesoKg;
        } else {
            System.out.println("Erro: Peso do projetor deve ser maior que zero.");
        }
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLigado() { // Padrão Java para getters de booleano é "is"
        return ligado;
    }
}