package basic;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //5. Ler um número inteiro e exibir o seu sucessor.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        numero++;

        System.out.println("O sucessor é: "+numero);

    }
}
