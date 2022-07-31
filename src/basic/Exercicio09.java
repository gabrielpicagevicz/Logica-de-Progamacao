package basic;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //9. Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
        //seu raio e sua altura.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        double raio = sc.nextDouble();
        System.out.println("Digite o Altura");
        double altura = sc.nextDouble();

        double volume = 3.14 * raio * altura;

        System.out.println("O volume é: " + volume);

    }
}
