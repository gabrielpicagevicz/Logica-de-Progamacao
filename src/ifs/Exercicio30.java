package ifs;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
//        30. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//        Álcool Até 25 litros, desconto de 2% por litro
//        Acima de 25 litros, desconto de 4% por litro
//        Gasolina Até 25 litros, desconto de 3% por litro
//        Acima de 25 litros, desconto de 5% por litro
//        Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
//                (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
//        pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,70 e o preço do litro
//        do álcool é R$ 1,90.


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite A para  álcool ou G para gasolina");
        String letra = sc.nextLine();

        double litros;
        double aux;
        double calculo = 0;

        if (!(letra.equals("A") || letra.equals("G"))) {
            System.out.println("Digite uma letra valida!");
        } else {
            System.out.println("Digite a quantidade de litros: ");
            litros = sc.nextDouble();

            if (letra.equals("A") && litros <= 25) {
                aux = litros * 0.02;
                calculo = ((litros * 2.70) - aux);
            } else if (letra.equals("A") && litros > 25) {
                aux = litros * 0.04;
                calculo = ((litros * 2.70) - aux);
            } else if (letra.equals("G") && litros <= 25) {
                aux = litros * 0.03;
                calculo = ((litros * 1.90) - aux);
            } else if (letra.equals("G") && litros > 25) {
                aux = litros * 0.05;
                calculo = ((litros * 1.90) - aux);
            }


            System.out.println("O valor total foi de " + calculo);
        }


    }
}
