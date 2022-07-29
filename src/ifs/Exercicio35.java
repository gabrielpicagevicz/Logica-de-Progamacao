package ifs;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
//        35. Escreva um programa que leia um número inteiro de 1 a 7 e informe o dia da semana
//        correspondente, sendo domingo o dia de número 1. Se o número não corresponder a um
//        dia da semana, mostre uma mensagem de erro.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 numero de 1 a 7");
        int numero = sc.nextInt();

            switch (numero){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.print("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Erro número invalido");
            }
        }


    }

