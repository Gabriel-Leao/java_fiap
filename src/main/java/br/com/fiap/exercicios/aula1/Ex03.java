package br.com.fiap.exercicios.aula1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo: ");
        double salary = scanner.nextDouble();
        scanner.close();

        double newSalary = salary + (salary * 0.01);
        System.out.printf("Novo salário: %.2f%n", newSalary);
    }
}
