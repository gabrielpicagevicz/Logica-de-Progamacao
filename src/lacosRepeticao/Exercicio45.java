package lacosRepeticao;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        //45. Escreva um programa que leia 5 números, e imprima a média entre eles.

        Scanner sc = new Scanner(System.in);


        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite " + i + "° número: ");
            int numero = sc.nextInt();

            soma += numero;
        }
        System.out.println("A soma entre eles é: " + soma);

    }
}
