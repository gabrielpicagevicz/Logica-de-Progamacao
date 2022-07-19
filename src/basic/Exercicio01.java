package basic;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
//        1. Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
//        perímetro.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base");
        double base = sc.nextDouble();

        System.out.println("Digite a altura");
        double altura = sc.nextDouble();

        double area = (base * altura);
        double perimetro = 2 * (base * altura);


        System.out.println("A área do do retângulo é: "+area+" e o perímetro é "+perimetro);
    }
}
