package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex07For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + "ªLinha ");
            System.out.print(" Quadrado: " + (i * i));
            System.out.println(" Cubo: " + (i * i * i));
        }
        sc.close();

    }
}
