package ifs;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        /*37. Uma Cia de pulverização utiliza avião para pulverizar lavouras. Os custos de
        pulverização dependem do tipo de praga e da área a ser contratada conforme a tabela:
        Tipo 1 – ervas daninhas R$ 50,00 por acre;
        Tipo 2 – gafanhotos R$ 100,00 por acre;
        Tipo 3 – broca R$ 150,00 por acre;
        Tipo 4 – todos acima R$ 250,00 por acre.
        Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de
        5%. Em adição, qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um
        desconto de 10% sobre o valor que ultrapassar os R$ 750,00. Caso ambos os descontos se
        aplicam o da área é calculado antes. Fazer um algoritmo que leia: o tipo de pulverização
        (1 a 4) e área a ser pulverizada; e imprima o valor a ser pago.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo da praga e a área: \n" +
                "        Tipo 1 – ervas daninhas R$ 50,00 por acre;\n" +
                "        Tipo 2 – gafanhotos R$ 100,00 por acre;\n" +
                "        Tipo 3 – broca R$ 150,00 por acre;\n" +
                "        Tipo 4 – todos acima R$ 250,00 por acre.");
        double praga = sc.nextDouble();
        double area = 0;
        double valorDesconto = 0;
        double calc;
        double descontoDez = 0;

        if (praga > 4 || praga < 1) {
            System.out.println("Opção inválida: ");
        } else {
            System.out.println("Digite o tamanho da área: ");
            area = sc.nextDouble();
        }
        if (praga == 1 && area < 1000) {
            calc = (area * 50);
            System.out.println("Tipo 1 Escolhida: \n " +
                    "O valor total foi de: " + calc + " R$");
        } else if (praga == 1 && area > 1000) {
            calc = (area * 50);
            valorDesconto = (calc * 0.05);
            calc = (calc - valorDesconto);

            if (calc > 750) {
                descontoDez = (calc * 0.10);
                calc = (calc - descontoDez);
                System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                        "E o valor passou de 750 então possui +  valor total foi de: " + calc + " R$");
                System.exit(1);
            }


            System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                    "O valor total foi de: " + calc + " R$");
        }

        if (praga == 2 && area < 1000) {
            calc = (area * 100);
            System.out.println("Tipo 2 Escolhida: \n " +
                    "O valor total foi de: " + calc + " R$");
        } else if (praga == 2 && area > 1000) {
            calc = (area * 100);
            valorDesconto = (calc * 0.05);
            calc = (calc - valorDesconto);

            if (calc > 750) {
                descontoDez = (calc * 0.10);
                calc = (calc - descontoDez);
                System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                        "E o valor passou de 750 então possui +  valor total foi de: " + calc + " R$");
                System.exit(1);
            }

            System.out.println("Tipo 2 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                    "O valor total foi de: " + calc + " R$");
        }

        if (praga == 3 && area < 1000) {
            calc = (area * 150);
            System.out.println("Tipo 1 Escolhida: \n " +
                    "O valor total foi de: " + calc + " R$");
        } else if (praga == 3 && area > 1000) {
            calc = (area * 150);
            valorDesconto = (calc * 0.05);
            calc = (calc - valorDesconto);

            if (calc > 750) {
                descontoDez = (calc * 0.10);
                calc = (calc - descontoDez);
                System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                        "E o valor passou de 750 então possui +  valor total foi de: " + calc + " R$");
                System.exit(1);
            }

            System.out.println("Tipo 3 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                    "O valor total foi de: " + calc + " R$");
        }

        if (praga == 4 && area < 1000) {
            calc = (area * 250);
            System.out.println("Tipo 4 Escolhida: \n " +
                    "O valor total foi de: " + calc + " R$");
        } else if (praga == 4 && area > 1000) {
            calc = (area * 250);
            valorDesconto = (calc * 0.05);
            calc = (calc - valorDesconto);
            if (calc > 750) {
                descontoDez = (calc * 0.10);
                calc = (calc - descontoDez);
                System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                        "E o valor passou de 750 então possui +  valor total foi de: " + calc + " R$");
                System.exit(1);
            }
            System.out.println("Tipo 1 Escolhida e o acre é maior que 1000 possui 5% de desconto: \n " +
                    "O valor total foi de: " + calc + " R$");
        }

    }
}
