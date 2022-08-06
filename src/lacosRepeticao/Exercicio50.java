package lacosRepeticao;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
//        50. Escreva um programa que leia um valor e imprima todas as possíveis combinações em
//        que o lançamento de um par de dados tenha como resultado da soma dos valores dos
//        dados o número lido. Por exemplo, se a entrada for o número 7, o programa deve
//        imprimir as seguintes combinações:
//                                      • 1 6
//                                      • 2 5
//                                      • 3 4
//                                      • 4 3
//                                      • 5 2
//                                      • 6 1

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int aux = numero;
       for(int i = 1; i < numero; i++){
           aux--;
           System.out.println(i + " " + aux);
       }
    }
}
