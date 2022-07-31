package lacosRepeticao;

public class Exercicio44 {
    public static void main(String[] args) {
//        44. Escreva um programa que imprima todos os números de 1 até 100, inclusive, e a soma
//        de todos eles.

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            soma += i;

        }
        System.out.println("A soma entre dos é: "+soma);

    }
}
