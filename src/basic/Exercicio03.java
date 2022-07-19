package basic;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3. Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do raio");
        double raio = sc.nextDouble();

        double area = (3.14 * raio * raio);
        double perimetro = (2 * 3.14 * raio);


        System.out.println("A aréa da circunferência é: "+area+" o perímetro é: "+perimetro);

    }
}
