package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex05For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Fatorial:");
        System.out.println("Digite o Número que será Fatorado");
        int n = sc.nextInt();
        int soma = n;

        if (n == 0) {
            soma = 1;
            System.out.printf("Resultado de %d Fatorial: %d", n, soma);

        } else {
            for (int i = 1; i < n; i++) {
                int fat = (n-i);
                soma *= fat;
            }
            System.out.printf("Resultado de %d Fatorial: %d", n, soma);
        }
        sc.close();
    }
}
