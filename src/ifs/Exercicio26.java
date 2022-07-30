package ifs;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
       // 26. Escreva um programa que leia 3 valores e escreva a soma dos 2 maiores.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double primeiro = sc.nextDouble();


        System.out.println("Digite o segundo número");
        double segundo = sc.nextDouble();

        System.out.println("Digite o terceiro número");
        double terceiro = sc.nextDouble();

        if(primeiro > segundo && segundo > terceiro){
            System.out.println("A soma dos dois maiores é: "+(primeiro + segundo));
        } else if(primeiro > terceiro && segundo > terceiro){
            System.out.println("A soma dos dois maiores é: "+(primeiro + segundo));
        }else if(segundo > terceiro && primeiro > terceiro){
            System.out.println("A soma dos dois maiores é: "+(primeiro + segundo));
        } else if(segundo > terceiro && terceiro > primeiro){
            System.out.println("A soma dos dois maiores é: "+(terceiro + segundo));
        } else if(terceiro > primeiro && primeiro > segundo){
            System.out.println("A soma dos dois maiores é: "+(primeiro + terceiro));
        } else if(terceiro > segundo && terceiro > primeiro){
            System.out.println("A soma dos dois maiores é: "+(terceiro + segundo));
        } else {
            System.out.println("São todos iguais");
        }

    }
}
