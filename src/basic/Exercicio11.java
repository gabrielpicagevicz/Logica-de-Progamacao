package basic;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
//        11. Faça um algoritmo para calcular a nota semestral de um aluno. A nota semestral é obtida
//        pela média aritmética entre a nota de 2 bimestres. Cada nota de bimestre é composta por
//        2 notas de provas.

        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro Bimestre digite a primeira nota da prova 1");
        double provaUmPrimeiroBi = sc.nextDouble();

        System.out.println("Primeiro Bimestre digite a primeira nota da prova 2");
        double provaDoisPrimeiroBi = sc.nextDouble();

        System.out.println("Segundo Bimestre digite a primeira nota da prova 1");
        double provaUmSegundoBi = sc.nextDouble();

        System.out.println("Segundo Bimestre digite a primeira nota da prova 2");
        double provaDoisSegundoBi = sc.nextDouble();

        double notaPrimeiroBimestre = provaUmPrimeiroBi + provaDoisPrimeiroBi;
        double notaSegundoBimestre = provaUmSegundoBi + provaDoisSegundoBi;

        double notaFinal = (notaPrimeiroBimestre + notaSegundoBimestre) / 2;

        System.out.println("A nota semestral é: "+notaFinal);

    }
}
