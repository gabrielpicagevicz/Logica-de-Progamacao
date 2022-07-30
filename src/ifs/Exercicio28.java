package ifs;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
      //  28. Escreva um programa que leia uma letra e mostre se ela é vogal ou consoante.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = sc.nextLine();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")  ){
            System.out.println("É Vogal");
        } else {
            System.out.println("É consoante");
        }
    }
}
