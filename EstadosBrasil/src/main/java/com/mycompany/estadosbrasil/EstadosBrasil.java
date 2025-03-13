package com.mycompany.estadosbrasil;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EstadosBrasil {
    private Set<String> estados;

    public EstadosBrasil() {
        this.estados = new HashSet<>();
    }

    public void adicionarEstado(String estado) {
        if (estados.add(estado)) {
            System.out.println("Estado adicionado com sucesso.");
        } else {
            System.out.println("Este estado já está na lista.");
        }
    }

    public void removerEstado(String estado) {
        if (estados.remove(estado)) {
            System.out.println("Estado removido com sucesso.");
        } else {
            System.out.println("Estado nao encontrado na lista.");
        }
    }

    public void exibirEstados() {
        if (estados.isEmpty()) {
            System.out.println("Nenhum estado cadastrado.");
        } else {
            System.out.println("Estados cadastrados: " + estados);
        }
    }

    public static void main(String[] args) {
        EstadosBrasil sistema = new EstadosBrasil();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Adicionar estado");
            System.out.println("2 - Remover estado");
            System.out.println("3 - Exibir estados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do estado: ");
                    String estadoAdicionar = scanner.nextLine();
                    sistema.adicionarEstado(estadoAdicionar);
                }
                case 2 -> {
                    System.out.print("Digite o nome do estado: ");
                    String estadoRemover = scanner.nextLine();
                    sistema.removerEstado(estadoRemover);
                }
                case 3 -> sistema.exibirEstados();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
