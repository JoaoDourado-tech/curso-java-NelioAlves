package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex01For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro de X (1<=X<=1000): ");
        int x = sc.nextInt();
        int impar;
        int contador = 0;

        System.out.println("Calculadora de Ímpares:");
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                impar = i;
                contador++;
                System.out.printf("%dºÍMPAR: %d%n",contador,impar);
            }
            /* Outra forma de Resolução mais Adequada:

                    System.out.println("Calculadora de Ímpares (Modo Turbo):");
                    //Ímpares pulam de 2 em 2 para o próximo:
                    for (int i=1; i<=x ; i+=2){
                        contador++;
                        System.out.printf(%dº ÍMPAR: %d%n", contador, i)
                    }

                    1 - Economia do IF-ELSE
                    2 - Menos variáveis
                    3 - Mais inteligente
             */
        }
        sc.close();

    }
}
