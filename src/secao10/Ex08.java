package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem analisados:");
        int num = sc.nextInt();

        int[] vetorNum = new int[num];
        int soma = 0;
        int quantPar = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Digite um Número:");
            vetorNum[i] = sc.nextInt();
            if (vetorNum[i] % 2 == 0) {
                soma += vetorNum[i];
                quantPar++;
            }
        }


        if (quantPar == 0) {
            System.out.println("NENHUM NÚMERO PAR DIGITADO");
        } else {
            double media = (double) soma / quantPar;
            System.out.println("Média dos Números PARES digitados:");
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
