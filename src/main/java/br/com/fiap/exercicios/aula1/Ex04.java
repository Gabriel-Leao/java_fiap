package br.com.fiap.exercicios.aula1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("O número digitado foi " + n);
        System.out.println("O antecessor do número é " + (n - 1));
        System.out.println("O sucessor do número é " + (n + 1));
    }
}
