package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quatro valores INTEIROS:");
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int conta = (a * b) - (c * d);
        System.out.println("O resultado da Diferença entre os Produtos é: " + conta);


        sc.close();
    }
}
