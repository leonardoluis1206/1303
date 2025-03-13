package com.mycompany.catalogoprodutos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogoProdutos {
    private static Map<Integer, String> catalogo = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Buscar produto pelo código");
            System.out.println("3. Exibir todos os produtos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    buscarProduto();
                    break;
                case 3:
                    exibirProdutos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private static void adicionarProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        if (catalogo.containsKey(codigo)) {
            System.out.println("Código já cadastrado!");
            return;
        }
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        catalogo.put(codigo, nome);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void buscarProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        if (catalogo.containsKey(codigo)) {
            System.out.println("Produto: " + catalogo.get(codigo));
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void exibirProdutos() {
        if (catalogo.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\nLista de Produtos:");
            for (Map.Entry<Integer, String> entry : catalogo.entrySet()) {
                System.out.println("Código: " + entry.getKey() + " - Produto: " + entry.getValue());
            }
        }
    }
}
