package ifs;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
//        27. Escreva um programa que leia 3 números e calcule a média ponderada entre eles.
//        Considere que o maior número recebe peso 5 e os outros dois recebem peso 2,5.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double primeiro = sc.nextDouble();

        System.out.println("Digite o segundo número");
        double segundo = sc.nextDouble();

        System.out.println("Digite o terceiro número");
        double terceiro = sc.nextDouble();

        if(primeiro > segundo &&  primeiro > terceiro){
            double media = primeiro + segundo + terceiro / 10;
            System.out.println("A média é: "+media);
        } else if(segundo > primeiro && segundo > terceiro){
            double media =  segundo + primeiro + terceiro / 10;
            System.out.println("A média é: "+media);
        } else if (terceiro > primeiro && terceiro > segundo){
            double media =  terceiro + segundo + primeiro / 10;
            System.out.println("A média é: "+media);
        }



    }
}
