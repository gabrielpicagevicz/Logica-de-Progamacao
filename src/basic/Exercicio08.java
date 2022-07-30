package basic;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //8. Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 * (F – 32), leu um
        //valor de temperatura em Fahrenheit e exibi-lo em Celsius

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em Fahrenheit?");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);

    }
}
