package br.com.fiap.exercicios.aula1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do sálario mínimo: R$");
        double minSalary = scanner.nextDouble();
        System.out.print("Valor do sálario: R$");
        double salary = scanner.nextDouble();
        scanner.close();

        double timesSalary = salary / minSalary;
        System.out.printf("Você ganha %.2f vezes um sálario mínimo", timesSalary);
    }
}
