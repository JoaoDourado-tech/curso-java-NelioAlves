package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem lidos:");
        int num = sc.nextInt();
        double soma = 0;
        double[] vetorNum = new double[num];

        System.out.println("Digite os números: ");
        for (int i = 0; i < num; i++) {
            vetorNum[i] = sc.nextDouble();
            soma += vetorNum[i];
        }
        double media = soma / num;
        System.out.printf("Média dos Números Digitados: %.3f%n",media);

        System.out.println("Elementos abaixo da Média");
        for (int i = 0; i<num; i++){
            if (vetorNum[i] < media) {
                System.out.printf("%.2f%n", vetorNum[i]);
            }
        }




        sc.close();
    }
}
