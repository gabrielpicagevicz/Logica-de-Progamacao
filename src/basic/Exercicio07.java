package basic;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        //7. Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e horas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em dias? ");
        int dias = sc.nextInt();

        double anos = (dias / 365);
        double meses = (dias / 30);
        double horas = (dias * 24);

        System.out.println("O valor da idade em anos é: "+anos+"\n" +
                "O valor da idade em meses é: "+meses+"\n" +
                "O valor da idade em horas é: "+horas);
    }
}
