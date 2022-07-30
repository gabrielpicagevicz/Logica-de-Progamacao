package ifs;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
       // 23. Escreva um programa que leia um número e imprima se este número é ou não par.


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 número");
        double numero = sc.nextDouble();

        if(numero % 2 == 0){
            System.out.println(numero+" Par");
        } else {
            System.out.println(numero+" Impar");
        }


    }
}
