package DesafioFiascao6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int opcaoOrdenacao = 0;
        String nomeParaBuscar;
        boolean isFound = false;

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Suna"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Suna"));

        while (opcao != 8) {
            System.out.println("<==--- Seja bem vindo ao Sistema de Listas Ninja ---==>");
            System.out.println("1 - Ordenar Lista");
            System.out.println("2 - Buscar Ninja");
            System.out.println("3 - Adicionar ninja no início da lista");
            System.out.println("4 - Remover ninja no início da lista");
            System.out.println("5 - Adicionar ninja");
            System.out.println("6 - Remover ninja");
            System.out.println("7 - Mostrar lista");
            System.out.println("8 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha o critério de ordenação da lista: ");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - Vila");
                    System.out.print("Digite sua opção: ");
                    opcaoOrdenacao = sc.nextInt();
                    switch (opcaoOrdenacao) {
                        case 1:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                            System.out.println("Lista de Ninjas ordenada por nome");
                            System.out.println(listDeNinjas);
                            break;
                        case 2:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                            System.out.println("Lista de Ninjas ordenada por idade");
                            System.out.println(listDeNinjas);
                            break;
                        case 3:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getAldeia));
                            System.out.println("Lista de Ninjas ordenada por aldeia");
                            System.out.println(listDeNinjas);
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do ninja que você deseja ver as informações:");
                    sc.nextLine();
                    nomeParaBuscar = sc.nextLine();
                    for (Ninja ninja : listDeNinjas) {
                        if (ninja.getNome().equalsIgnoreCase(nomeParaBuscar)) {
                            ninja.mostrarInformacoes();
                            isFound = true;
                        }
                    }
                    if (!isFound) {
                        System.out.println("O ninja " + nomeParaBuscar + " não foi encontrado!");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite o nome do ninja que deseja adicionar no início: ");
                    String nomeInicio = sc.nextLine();
                    System.out.println("Digite a idade do ninja que deseja adicionar no início: ");
                    int idadeInicio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a aldeia do ninja que deseja adicionar no início: ");
                    String aldeiaInicio = sc.nextLine();
                    listDeNinjas.addFirst(new Ninja(nomeInicio, idadeInicio, aldeiaInicio));
                    break;
                case 4:
                    System.out.println("Removendo ninja do início...");
                    listDeNinjas.removeFirst();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Digite o nome do ninja que deseja adicionar: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do ninja que deseja adicionar: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a aldeia do ninja que deseja adicionar: ");
                    String aldeia = sc.nextLine();
                    listDeNinjas.add(new Ninja(nome, idade, aldeia));
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Digite o nome do ninja que deseja remover: ");
                    String nomeParaRemover = sc.nextLine();

                    Iterator<Ninja> iterator = listDeNinjas.iterator();

                    while (iterator.hasNext()) {
                        Ninja ninja = iterator.next();
                        if (ninja.getNome().equalsIgnoreCase(nomeParaRemover)) {
                            iterator.remove();
                            System.out.println("O ninja " + ninja.getNome() + " foi removido!");
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("O ninja " + nomeParaRemover + " não foi encontrado!");
                    }
                    break;
                case 7:
                    System.out.println("====> Lista de ninjas <====");
                    System.out.println(listDeNinjas);
                    break;
                case 8:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
    }
}

