package ifs;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
//        36. Em uma certificação são feitos são feitos 5 exames (I, II, III, IV e V). Escreva um
//        programa que leia as notas destes exames e imprima a classificação do aluno, sabendo
//        que a média é 70.
//        Classificação: A – passou em todos os exames;
//        B – passou em I, II e IV, mas não em III ou V;
//        C – passou em I e II, III ou IV, mas não em V.
//                Reprovado – outras situações.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double quartaNota = sc.nextDouble();

        System.out.println("Digite a quinta nota: ");
        double quintaNota = sc.nextDouble();

        // C – passou em I e II, III ou IV, mas não em V.

        if (primeiraNota >= 7 && segundaNota >= 7 && terceiraNota >= 7 && quartaNota >= 7 && quintaNota >= 7) {
            System.out.println("Classificação: A – passou em todos os exames");
        } else if (primeiraNota >= 7 && segundaNota >= 7 && quartaNota >= 7 && terceiraNota < 7 && quintaNota < 7) {
            System.out.println("Classificação:  B – passou em I, II e IV, mas não em III ou V");
        } else if (primeiraNota >= 7 && segundaNota >= 7 && terceiraNota >= 7 && quartaNota >= 7 && quintaNota < 7) {
            System.out.println("Classificação:  C – passou em I e II, III ou IV, mas não em V");
        }

    }
}
