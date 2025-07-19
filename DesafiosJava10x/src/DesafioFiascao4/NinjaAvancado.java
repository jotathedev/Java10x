package DesafioFiascao4;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade elementoNinjutsu) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.elementoNinjutsu = elementoNinjutsu;
    }


    public NinjaAvancado() {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("<=-- Informações do Ninja --=>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Elemento primário de Ninjutsu: " + elementoNinjutsu );
        System.out.println("Especialidade: " + especialidade);
    }
}