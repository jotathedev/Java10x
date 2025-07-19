package DesafioFiascao4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade elementoNinjutsu;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade elementoNinjutsu) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.elementoNinjutsu = elementoNinjutsu;
    }

    public NinjaBasico() {

    }

    public void mostrarInformacoes() {
        System.out.println("<=-- Informações do Ninja --=>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Elemento primário de Ninjutsu: " + elementoNinjutsu );
    }

    public void executarHabilidade() {
        System.out.println("Lançando Habilidade: " + habilidade);
    }
}
