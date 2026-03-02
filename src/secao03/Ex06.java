package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = Math.PI * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = b * a;

        System.out.println("Áreas Calculadas:");
        System.out.printf("Triângulo Retângulo: " + areaTriangulo + "%n");
        System.out.printf("Círculo: " + areaCirculo + "%n");
        System.out.printf("Trapezio: " + areaTrapezio + "%n");
        System.out.printf("Quadrado: " + areaQuadrado + "%n");
        System.out.printf("Retangulo: " + areaRetangulo + "%n");
    }
}
