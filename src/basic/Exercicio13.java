package basic;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
//        13. Um circuito elétrico é composto de duas resistências R1 e R2 em paralelo, e ambas em
//        sequência de uma resistência R3. Faça um algoritmo para calcular a resistência
//        equivalente desse circuito.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a R1");
        double r1 = sc.nextDouble();

        System.out.println("Digite a R2");
        double r2 = sc.nextDouble();

        double resistencia = (r1 + r2);

        System.out.println("A resistência é: "+resistencia);

    }
}
