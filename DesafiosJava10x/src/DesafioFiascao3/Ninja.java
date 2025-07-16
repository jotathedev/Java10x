package DesafioFiascao3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("<=-- Informações do Ninja --=>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de dificuldade da missão: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}
