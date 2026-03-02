package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite DOIS numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 >= num2) {
            if (num1 % num2 == 0) {
                System.out.printf("Os números %d e %d são MÚLTIPLOS", num1, num2);
            } else {
                System.out.printf("Os números %d e %d NÃO são MÚLTIPLOS", num1, num2);
            }
        } if (num2 >= num1) {
            if (num2 % num1 == 0) {
                System.out.printf("Os números %d e %d são MÚLTIPLOS!", num2, num1);
            } else {
                System.out.printf("Os números %d e %d NÃO são MÚLTIPLOS!", num2, num1);
            }
        }


        sc.close();
    }
}
