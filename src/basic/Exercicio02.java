package basic;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //2. Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = (lado * lado);
        double perimetro = (lado + lado + lado + lado);

        System.out.println("A área do quadrado é: " + area + "O perímetro do mesmo é: " + perimetro);


    }
}
