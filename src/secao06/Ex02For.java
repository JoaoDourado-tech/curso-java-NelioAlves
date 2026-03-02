package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex02For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Números serão lidos?");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (10 <= x && x <= 20) {
                System.out.printf("%d IN",x);
                in++;
            } else {
                System.out.printf("%d OUT%n",x);
                out++;
            }
        }
        System.out.println("Resultado:");
        System.out.printf("IN: %d%n OUT: %d%n", in, out);


        sc.close();

    }
}
