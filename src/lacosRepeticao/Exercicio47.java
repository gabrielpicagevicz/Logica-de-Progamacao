package lacosRepeticao;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
//        48. Escreva um programa que determine se um dado número N (digitado pelo usuário) é
//        primo ou não.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int contador = 0;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                contador++;
                break;
            }
        }


        
        if(contador == 0){
            System.out.println("Número é primo");
        } else {
            System.out.println("não é primo");
        }

    }
}
