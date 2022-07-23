package ifs;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        //25. Escreva um programa que leia o número equivalente ao mês e imprima a quantidade de
        //dias deste mês.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero = sc.nextDouble();

        if(numero > 12 || numero < 1){
            System.out.println("Mês inválido entre com um número de 1 a 12");
        } else {
            if (numero == 1){
                System.out.println("Mês de Janeiro possuí 31 dias");
            }
            else if (numero == 2){
                System.out.println("Mês de Fevereiro possuí 28 dias");
            }
            else if (numero == 3){
                System.out.println("Mês de Março possuí 31 dias");
            }
            else if (numero == 4){
                System.out.println("Mês de Abril 30 dias");
            }
            else if (numero == 5){
                System.out.println("Mês de Maio possuí 31 dias");
            }
            else if (numero == 6){
                System.out.println("Mês de  Junho 30 dias");
            }
            else if (numero == 7){
                System.out.println("Mês de  Julho 31 dias");
            }
            else if (numero == 8){
                System.out.println("Mês de Agosto possuí 31 dias");
            }
            else if (numero == 9){
                System.out.println("Mês de Janeiro possuí 30 dias");
            }
            else if (numero == 10){
                System.out.println("Mês de Janeiro possuí 31 dias");
            }
            else if (numero == 11){
                System.out.println("Mês de Janeiro possuí 30 dias");
            }
            else if (numero == 12){
                System.out.println("Mês de Janeiro possuí 31 dias");
            }
        }

    }
}
