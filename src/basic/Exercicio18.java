package basic;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
       //18. Escreva um programa que permute o valor de duas variáveis inteiras.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número");
        int primeiro = sc.nextInt();

        System.out.println("Digite o valor do segundo número");
        int segundo = sc.nextInt();

        int aux = primeiro;
        primeiro = segundo;
        segundo = aux;

        System.out.println("O valor do primeiro é: "+primeiro+" O valor do segundo é" + segundo);


    }
}
