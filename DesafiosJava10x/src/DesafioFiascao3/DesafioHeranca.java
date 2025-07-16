package DesafioFiascao3;

public class DesafioHeranca {
    public static void main(String[] args) {
        Ninja Ebisu = new Ninja();
        Ebisu.nome = "Ebisu";
        Ebisu.idade = 32;
        Ebisu.missao = "Ser o tutor de elite de Konohamaru";
        Ebisu.nivelDeDificuldade = "B";
        Ebisu.statusMissao = "Em andamento";
        Ebisu.mostrarInformacoes();

        System.out.println("---------------------------------------");

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.habilidadeEspecial = "Amaterasu";
        Sasuke.missao = "Proteger Naruto na Guerra Ninja";
        Sasuke.nivelDeDificuldade = "S";
        Sasuke.statusMissao = "Concluída";
        Sasuke.mostrarInformacoes();
    }
}
