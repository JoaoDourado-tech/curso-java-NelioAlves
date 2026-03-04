package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.Triangulo;

public class Aula71e72 {
    public static void main(String[] args) {
        //Exercício SEM POO
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Agora usando POO:
        Triangulo x, y;
        x = new Triangulo(); //Instanciando X
        y = new Triangulo(); //Instanciando Y

        System.out.println("Insira o valor dos TRÊS LADOS do Triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira o valor dos TRÊS LADOS do Triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println("CALCULANDO ÁREA TRIÂNGULO X e Y:");
        double areaX = areaTriangulo(x.a, x.b, x.c);
        double areaY = areaTriangulo(y.a, y.b, y.c);

        System.out.printf("Área do Triângulo X = %.2f%n", areaX);
        System.out.printf("Área do Triângulo Y = %.2f%n", areaY);

        System.out.println("Comparado Áreas obtidas...");
        double maiorArea = compararArea(areaX, areaY);

        System.out.printf("Maior Área: %.2f%n", maiorArea);

        sc.close();
    }

    public static double areaTriangulo(double l1, double l2, double l3) {
        double p = ((l1 + l2 + l3) / 2);
        return (Math.sqrt(p * (p - l1) * (p - l2) * (p - l3)));
    }
    public static double compararArea(double a1, double a2) {
        return Math.max(a1, a2); // Math.max(X,Y) retorna o maior dos dois
    }
}
