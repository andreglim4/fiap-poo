package br.com.fiapride.main;

// Importamos a classe Projetor para que o sistema a reconheça
import br.com.fiapride.model.Projetor;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Projetor atributosProjetor = new Projetor();
        atributosProjetor.material = "Aço";
        atributosProjetor.pesoKg = 10.0;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Material do Projetor: " + atributosProjetor.material);
        System.out.println("Peso do Projetor: " + atributosProjetor.pesoKg);
  
    }
}