package com.mycompany.cadastrousuarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroUsuarios {
    private static Map<String, String> usuarios = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Exibir usuários");
            System.out.println("3. Buscar usuário por CPF");
            System.out.println("4. Remover usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    adicionarUsuario();
                    break;
                case 2:
                    exibirUsuarios();
                    break;
                case 3:
                    buscarUsuario();
                    break;
                case 4:
                    removerUsuario();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void adicionarUsuario() {
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        if (usuarios.containsKey(cpf)) {
            System.out.println("CPF já cadastrado!");
            return;
        }
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        usuarios.put(cpf, nome);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void exibirUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\nLista de Usuários:");
            for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                System.out.println("CPF: " + entry.getKey() + " - Nome: " + entry.getValue());
            }
        }
    }

    private static void buscarUsuario() {
        System.out.print("Digite o CPF para busca: ");
        String cpf = scanner.nextLine();
        if (usuarios.containsKey(cpf)) {
            System.out.println("Nome: " + usuarios.get(cpf));
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void removerUsuario() {
        System.out.print("Digite o CPF do usuário a ser removido: ");
        String cpf = scanner.nextLine();
        if (usuarios.remove(cpf) != null) {
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("CPF não encontrado!");
        }
    }
}

