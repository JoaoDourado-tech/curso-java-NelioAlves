package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números avaliados:");
        int num = sc.nextInt();
        int[] vetorNum = new int[num];
        int quantPar = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Digite um Número:");
            vetorNum[i] = sc.nextInt();
            if (vetorNum[i] % 2 == 0) {
                quantPar++;
            }
        }
        System.out.println("MOSTRANDO NÚMEROS PARES:");
        for (int i = 0; i < num; i++) {
            if (vetorNum[i] % 2 == 0) {
                System.out.println(vetorNum[i]);
            }
        }
        System.out.println("QUANTIDADE DE PARES:");
        System.out.println(quantPar);
        sc.close();
    }
}
