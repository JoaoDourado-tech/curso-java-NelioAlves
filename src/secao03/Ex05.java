package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Código do Produto 1:");
        int codigoP1 = sc.nextInt();
        System.out.println("Insira o Número de Peças do Produto 1:");
        int quantP1 = sc.nextInt();
        System.out.println("Insira o Valor Unitário do Produto 1:");
        double valorP1 = sc.nextDouble();

        System.out.println("Insira o Código do Produto 2:");
        int codigoP2 = sc.nextInt();
        System.out.println("Insira o Número de Peças do Produto 2:");
        int quantP2 = sc.nextInt();
        System.out.println("Insira o Valor Unitário do Produto 2:");
        double valorP2 = sc.nextDouble();

        System.out.printf("CALCULANDO O VALOR TOTAL dos Produtos: %d, %d%n", codigoP1, codigoP2);
        double valorTotal = (valorP1 * quantP1) + (valorP2 * quantP2);
        System.out.printf("Total a Pagar: %.2f%n", valorTotal);

        sc.close();
    }
}
