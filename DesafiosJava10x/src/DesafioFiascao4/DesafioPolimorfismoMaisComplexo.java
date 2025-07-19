package DesafioFiascao4;

public class DesafioPolimorfismoMaisComplexo {
    public static void main(String[] args) {

        NinjaBasico Asuma = new NinjaBasico("Asuma Sarutobi", 31, "Jutsu Fuujin", TipoHabilidade.FUUTON);
        Asuma.mostrarInformacoes();
        System.out.println("------------------------------------");
        Asuma.executarHabilidade();

        NinjaAvancado Jiraiya = new NinjaAvancado("Jiraiya", 54, "Jutsu Hari Jizou", "Jutsu Rasengan", TipoHabilidade.KATON);
        Jiraiya.mostrarInformacoes();
        System.out.println("------------------------------------");
        Jiraiya.executarHabilidade();

    }
}
