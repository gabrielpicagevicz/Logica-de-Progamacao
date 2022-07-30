package ifs;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
//        38. Chama-se ano bissexto o ano ao qual é acrescentado um dia extra, ficando ele com 366
//        dias, um dia a mais do que os anos normais de 365 dias, ocorrendo a cada quatro anos.
//        Escreva um programa que verifique se um ano é bissexto. Um ano é bissexto se ele é
//        divisível por 4. Entretanto, se o ano é divisível por 100, ele não é bissexto. Mas, se ele for
//        divisível por 400, ele volta a ser bissexto.
//        a. São bissextos os anos: 1600, 1996, 2000, 2004, 2008, 2012, 2016, 2400, 2800, ...
//        b. Não são bissextos: 1500, 1974, 1982, 1983, 1990, 2018, 2022, 2030, 2038, ..

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        double ano = sc.nextDouble();

        if(ano % 4 == 0){
            System.out.println("bissexto");
        } else if((ano % 100 == 0) && (ano % 400 == 0)){
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("não e bissexto");
        }

    }
}
