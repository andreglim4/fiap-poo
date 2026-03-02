package br.com.fiapride.main;

import br.com.fiapride.model.Projetor;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // 1. Instanciando o objeto Projetor (criando um projetor real na memória)
        Projetor meuProjetor = new Projetor("Plástico e Alumínio", 2.5, "30x20x10cm");

        System.out.println("--- Teste do Sistema de Projeção ---");
        
        // 2. Exibindo as características iniciais usando os GETTERS
        System.out.println("Material: " + meuProjetor.getMaterial());
        System.out.println("Peso: " + meuProjetor.getPesoKg() + "kg");
        System.out.println("Tamanho: " + meuProjetor.getTamanho());

        System.out.println("\n--- Testando Lógica de Operação ---");

        // 3. Tentando ajustar o foco com ele desligado (deve dar erro/aviso)
        meuProjetor.ajustarFoco();

        // 4. Ligando o projetor
        meuProjetor.ligarProjetor();

        // 5. Agora ajustando o foco com ele ligado
        meuProjetor.ajustarFoco();

        // 6. Tentando ligar novamente (deve avisar que já está ligado)
        meuProjetor.ligarProjetor();

        // 7. Desligando o aparelho
        meuProjetor.desligarProjetor();

        System.out.println("\n--- Teste de Encapsulamento ---");
        // Nota: Se você tentar digitar meuProjetor.setPesoKg(10), 
        // o Eclipse mostrará um erro, pois o método é PRIVATE no seu diagrama!
        System.out.println("O encapsulamento está protegendo os atributos físicos.");
    }
}