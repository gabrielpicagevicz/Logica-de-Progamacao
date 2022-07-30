package ifs;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
//        33. Escreva um algoritmo que leia 2 valores (x e y), que devem representar as coordenadas
//        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite x");
        double x = sc.nextDouble();

        System.out.println("Digite y");
        double y = sc.nextDouble();

        if( x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if ( x > 0 && y >0){
            System.out.println("Q1\n");
        } else if (x < 0 && y > 0){
            System.out.println("Q2\n");
        } else if (x < 0 && y < 0){
            System.out.println("Q3\n");
        } else if (x > 0 && y < 0){
            System.out.println("Q4\n");
        } else if (x == 0){
            System.out.println("Eixo Y\n");
        } else if( y == 0){
            System.out.println("Eixo X\n");
        }

    }
}
