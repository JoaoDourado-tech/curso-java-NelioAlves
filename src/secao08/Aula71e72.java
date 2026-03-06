package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.Entities.Triangulo;

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
        double areaX = x.areaTriangulo();
        double areaY = y.areaTriangulo();

        System.out.printf("Área do Triângulo X = %.2f%n", areaX);
        System.out.printf("Área do Triângulo Y = %.2f%n", areaY);

        System.out.println("Comparado Áreas obtidas...");
        double maiorArea = x.compararArea(y);

        System.out.printf("Maior Área: %.2f%n", maiorArea);

        sc.close();
    }
}
