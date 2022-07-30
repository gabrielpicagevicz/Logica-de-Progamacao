package lacosRepeticao;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
//        48. Escreva um programa que determine se um dado número N (digitado pelo usuário) é
//        primo ou não.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if((numero % 1 == 0) && (numero % numero == 0)){
            System.out.println(numero+" é número é primo!");
        } else {
            System.out.println("Não é primo");
        }

    }
}
