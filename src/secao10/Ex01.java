package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Números a ser armazenados:");
        int n = sc.nextInt();
        int[] vetorNum = new int[n];

        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                System.out.println("Digite um número:");
                vetorNum[i] = sc.nextInt();
            }
        } else {
            System.out.println("[ERRO] Digite um valor entre 1 e 10");
        }

        System.out.println("Números Digitados:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorNum[i]);
        }
        System.out.println("Número Negativos Digitados:");
        for (int i = 0; i < n; i++) {
            if(vetorNum[i] < 0){
                System.out.println(vetorNum[i]);
            }
        }
    }
}
