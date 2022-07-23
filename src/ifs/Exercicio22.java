package ifs;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        //22. Escreva um programa que leia um número e exiba o seu módulo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();
        double aux;
        if(numero > 0){
            aux = numero * (-1);
        } else {
            aux = numero;
        }

        System.out.println("O módulo de "+numero+" é " + aux);


    }
}
