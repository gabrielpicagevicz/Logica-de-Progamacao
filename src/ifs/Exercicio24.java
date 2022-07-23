package ifs;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
     //   24. Escreva um programa que leia três números e mostre o maior entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double primeiro = sc.nextDouble();


        System.out.println("Digite o segundo número");
        double segundo = sc.nextDouble();

        System.out.println("Digite o terceiro número");
        double terceiro = sc.nextDouble();

        if(primeiro > segundo && primeiro > terceiro){
            System.out.println("Primeiro é maior");
        } else if (segundo > primeiro && segundo > terceiro){
            System.out.println("Segundo é maior");
        } else if(terceiro > primeiro && terceiro > segundo){
            System.out.println("Terceiro é maior");
        } else {
            System.out.println("Todos iguais");
        }

    }
}
