package basic;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
//        15. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é
//        suficientemente longa. Assumindo que seja possível medir sua sombra e a do prédio no
//        chão, e que você lembre da sua altura, faça um programa para ler os dados necessários e
//        calcular a altura do prédio.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua sombra");
        double sombra = sc.nextDouble();

        System.out.println("Digite o tamanho da sombra do prédio");
        double predio = sc.nextDouble();

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double auxiliar = (predio / altura);

        double alturaPredio = (auxiliar * altura);

        System.out.println("A altura do prédio é: "+alturaPredio);

    }
}
