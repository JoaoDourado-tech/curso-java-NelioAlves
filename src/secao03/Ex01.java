package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Digite dois Números:");
        a = sc.nextInt();
        b = sc.nextInt();

        int soma = a + b;
        System.out.println("Soma dos Dois Números: " + soma);


        sc.close();
    }
}
