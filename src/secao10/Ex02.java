package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Números a ser analisado:");
        int n = sc.nextInt();

        int[] vetorN = new int[n];
        int somaN = 0;

        for(int i=0; i<n; i++){
            System.out.println("Digite um número:");
            vetorN[i] = sc.nextInt();
            somaN += vetorN[i];
        }


        System.out.println("Valores Digitados:");
        for(int j=0; j<n; j++){
            System.out.println(vetorN[j]);
        }

        System.out.println("Soma dos Valores:");
        System.out.println(somaN);

        System.out.println("Media dos Valores:");
        double mediaN = (double) somaN / n;
        System.out.println(mediaN);


        sc.close();
    }
}
