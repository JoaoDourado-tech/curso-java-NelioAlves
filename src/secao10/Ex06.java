package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados para cada vetor?");
        int num = sc.nextInt();

        int[] vetorA = new int[num];
        int[] vetorB = new int[num];
        int[] vetorC = new int[num];

        System.out.println("Digite os números do Vetor A:");
        for( int i = 0; i<num;i++){
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os Números do Vetor B:");
        for ( int i = 0; i<num;i++){
            vetorB[i] = sc.nextInt();
        }

        for ( int i = 0; i<num;i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Resultado do Vetor C");
        for (int v = 0; v<num; v++){
            System.out.println(vetorC[v]);
        }



        sc.close();
    }
}
