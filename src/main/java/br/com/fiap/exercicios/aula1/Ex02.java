package br.com.fiap.exercicios.aula1;

public class Ex02 {
    public static void main(String[] args) {
        int average1 = (8 + 9 + 7) / 3;
        int average2 = (4 + 5 + 6) / 3;
        float averageSum = average1 + average2;
        float averageAverage = averageSum / 2;
        System.out.println("Média 1: " + average1);
        System.out.println("Média 2: " + average2);
        System.out.println("Soma das médias: " + averageSum);
        System.out.println("Média das médias: " + averageAverage);
    }
}
