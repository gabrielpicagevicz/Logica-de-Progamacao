package basic;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //4. Dado os três lados de um triângulo determinar o perímetro do mesmo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo: ");
        double primeiro = sc.nextDouble();
        System.out.println("Digite o segundo lado do triângulo: ");
        double segundo = sc.nextDouble();
        System.out.println("Digite o segundo lado do triângulo: ");
        double terceiro = sc.nextDouble();

        double perimetro = (primeiro + segundo + terceiro);

        System.out.println("O perímetro do triângulo é: "+perimetro);

    }
}
