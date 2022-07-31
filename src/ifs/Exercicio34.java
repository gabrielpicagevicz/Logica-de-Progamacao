package ifs;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
//        34. Uma financeira usa o seguinte critério para conceder empréstimos: o valor total do
//            empréstimo deve ser até dez vezes o valor da renda mensal do solicitante e o valor da
//        prestação deve ser no máximo 30% da renda mensal do solicitante. Escreva um programa
//        que leia a renda mensal de um solicitante, o valor total do empréstimo solicitado e o
//        número de prestações que o solicitante deseja pagar e informe se o empréstimo pode ou
//        não ser concedido.


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da renda mensal: ");
        double rendaMensal = sc.nextDouble();

        System.out.println("Digite o valor total do empréstimo solicitado: ");
        double valorTotalEmprestimo = sc.nextDouble();

        System.out.println("Digite o número de prestações que o solicitante: ");
        double numeroPrestacoes = sc.nextDouble();

        double valorTotal = (rendaMensal * 10);

        double prestacaoMaxima = (rendaMensal * 3.33);
        double prestacao = (rendaMensal - prestacaoMaxima);

        if (valorTotalEmprestimo > valorTotal || prestacao > rendaMensal) {
            System.out.println("Emprestimo não pode ser feito!");
        } else {
            System.out.println("Empréstimo pode ser concedido");
        }
    }
}
