package basic;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //6. Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();

        double quociente = primeiro / segundo;
        double quocienteDois = segundo / primeiro;
        double restoDivisao = primeiro % segundo;
        double restoDivisaoDois = segundo % primeiro;

        System.out.println("O quociente do primeiro pelo segundo é: "+quociente+"\n"+"" +
                "O quociente do segundo pelo primeiro é: "+quocienteDois+"\n" +
                "O resto da divisão do primeiro pelo segundo é: "+restoDivisao+"\n" +
                "O resto da divisão do segundo pelo primeiro é: "+restoDivisaoDois);

    }
}
