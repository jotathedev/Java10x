package DesafioFiascao3;

import java.util.Scanner;

public class DesafioHerancaMaisComplexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buscarPorNome;
        String nomeNovaHabilidade;
        final int NINJAS_MAX = 10;
        Ninja[] ninjasComuns = new Ninja[NINJAS_MAX];
        Uchiha[] ninjasUchihas = new Uchiha[NINJAS_MAX];
        int ninjasComunsCadastrados = 0;
        int ninjasUchihasCadastrados = 0;
        int ninjasCadastrados = 0;
        int opcao = 0;
        int opcaoNinjas = 0;

        while (opcao != 4) {
            System.out.println("<=-- Seja bem-vindo ao Ninja Databook --=>");
            System.out.println("1 - Adicionar ninjas");
            System.out.println("2 - Exibir informações de todos os ninjas");
            System.out.println("3 - Atualizar habilidade especial do ninja");
            System.out.println("4 - Fechar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            // Come o espaço deixado no buffer
            sc.nextLine();
            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NINJAS_MAX) {
                        System.out.println("Seu ninja será de qual tipo?");
                        System.out.println("1 - Comum");
                        System.out.println("2 - Uchiha");
                        System.out.print("Escolha uma opção: ");
                        opcaoNinjas = sc.nextInt();
                        // Come o espaço deixado no buffer
                        sc.nextLine();
                        if (opcaoNinjas == 1) {
                            ninjasComuns[ninjasComunsCadastrados] = new Ninja();
                            System.out.println("Digite o nome do ninja: ");
                            ninjasComuns[ninjasComunsCadastrados].nome = sc.nextLine();
                            System.out.println("Digite a idade do ninja: ");
                            ninjasComuns[ninjasComunsCadastrados].idade = sc.nextInt();
                            // Come o espaço deixado no buffer
                            sc.nextLine();
                            System.out.println("Digite a missão do ninja: ");
                            ninjasComuns[ninjasComunsCadastrados].missao = sc.nextLine();
                            System.out.println("Digite o nível de dificuldade da missão do ninja: ");
                            ninjasComuns[ninjasComunsCadastrados].nivelDeDificuldade = sc.nextLine();
                            System.out.println("Digite o status da missão do ninja: ");
                            ninjasComuns[ninjasComunsCadastrados].statusMissao = sc.nextLine();
                            ninjasComunsCadastrados++;
                        } else if (opcaoNinjas == 2) {
                            ninjasUchihas[ninjasUchihasCadastrados] = new Uchiha();
                            System.out.println("Digite o nome do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].nome = sc.nextLine();
                            System.out.println("Digite a idade do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].idade = sc.nextInt();
                            // Come o espaço deixado no buffer
                            sc.nextLine();
                            System.out.println("Digite a habilidade especial do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].habilidadeEspecial = sc.nextLine();
                            System.out.println("Digite a missão do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].missao = sc.nextLine();
                            System.out.println("Digite o nível de dificuldade da missão do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].nivelDeDificuldade = sc.nextLine();
                            System.out.println("Digite o status da missão do ninja: ");
                            ninjasUchihas[ninjasUchihasCadastrados].statusMissao = sc.nextLine();
                            ninjasUchihasCadastrados++;
                        } else {
                            System.out.println("Por favor, digite uma opção válida!");
                        }
                        ninjasCadastrados = ninjasComunsCadastrados + ninjasUchihasCadastrados;
                        // Tentando debugar / DEU CERTO, SÃO AS MARCAS DE GUERRA
                        System.out.println("O NUMERO DE NINJAS CADASTRADOS AGORA É: " + ninjasCadastrados);
                        System.out.println("O NUMERO DE NINJAS COMUNS CADASTRADOS AGORA É: " + ninjasComunsCadastrados);
                        System.out.println("O NUMERO DE NINJAS UCHIHAS CADASTRADOS AGORA É: " + ninjasUchihasCadastrados);
                    } else {
                        System.out.println("O número máximo de ninjas foi atingido!");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Não há ninjas cadastrados!");
                } else {
                            for (int i = 0; i < ninjasComunsCadastrados; i++) {
                                ninjasComuns[i].mostrarInformacoes();
                            }
                            for (int i = 0; i < ninjasUchihasCadastrados; i++) {
                                ninjasUchihas[i].mostrarInformacoes();
                            }
                    }
                    break;
                case 3:
                    boolean isFound = false;
                    System.out.println("Digite o nome do ninja que você deseja alterar a habilidade especial:");
                    buscarPorNome = sc.nextLine();
                    for (int i = 0; i < ninjasUchihasCadastrados; i++) {
                        if (buscarPorNome.equalsIgnoreCase(ninjasUchihas[i].nome)) {
                            System.out.println("Qual habilidade você deseja colocar?");
                            nomeNovaHabilidade = sc.nextLine();
                            ninjasUchihas[i].habilidadeEspecial = nomeNovaHabilidade;
                            isFound = true;
                            break;
                        }
                    }
                    System.out.println(isFound ? "A Habilidade especial foi atualizada!" : "O Ninja não possui habilidade especial!");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
        sc.close();
    }
}
