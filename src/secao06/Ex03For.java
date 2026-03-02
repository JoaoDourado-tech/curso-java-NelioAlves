package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex03For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a Quantidade de Casos Testados:");
        int N = sc.nextInt();
        System.out.println("A seguir: Insira 3 valores da Média Ponderada");

        for(int i=0;i<N;i++){
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();
            double media = ((v1*2)+(v2*3)+(v3*5))/(2+3+5);
            System.out.printf("A média ponderada é: %.2f%n", media);
        }

        sc.close();
    }
}
