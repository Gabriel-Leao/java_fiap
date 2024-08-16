package br.com.fiap.exercicios.aula1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de anos: ");
        int years = input.nextInt();
        System.out.print("Digite a quantidade de meses: ");
        int months = input.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        int days = input.nextInt();
        input.close();

        int totalDays = (years * 365) + (months * 30) + days;
        System.out.printf("A sua idade em dias é: %d", totalDays);
    }
}