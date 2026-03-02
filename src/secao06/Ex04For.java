package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex04For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de Pares que serão Testados:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("DIVISÃO IMPOSSÍVEL");
            } else{
                double result = (double) n1/n2;
                System.out.printf("Resultado: %.2f%n", result);
            }
            }


        sc.close();
    }
}
