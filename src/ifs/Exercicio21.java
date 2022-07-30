package ifs;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        //21. Escreva um programa que leia um número e exiba se ele é positivo ou negativo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero + " é negativo");
        }

    }
}
