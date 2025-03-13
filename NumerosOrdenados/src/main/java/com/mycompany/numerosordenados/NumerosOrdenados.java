package com.mycompany.numerosordenados;

import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite números inteiros (digite -1 para sair):");
        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }
        
        scanner.close();
        
        System.out.println("\nNúmeros armazenados em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
