package basic;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
//        12. Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário para
//        Km/h. Para tal, multiplique o valor em m/s por 3,6.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade em MS");
        double velocidadeMS = sc.nextDouble();

        double velocidadeKMH = (velocidadeMS * 3.6);

        System.out.println("A velocidade em Km/h é: "+velocidadeKMH);

    }
}
