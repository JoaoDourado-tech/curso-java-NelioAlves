package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 valores para localizar o QUADRANTE:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("QUADRANTE 1");
        } else if (x > 0 && y < 0) {
            System.out.println("QUADRANTE 4");
        } else if (x < 0 && y < 0) {
            System.out.println("QUADRANTE 3");
        } else if (x < 0 && y > 0) {
            System.out.println("QUADRANTE 2");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Ponto (0,0) ORIGEM");
        }
        sc.close();
    }
}
