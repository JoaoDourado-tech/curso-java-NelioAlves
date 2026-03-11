package secao08;

import secao08.Entities.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class ExConversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação do Dolar?");

        Conversor.cotacaoDolar = sc.nextDouble();

        System.out.println("Quantos $ Dolares serão comprados?");
        Conversor.valorDolar = sc.nextDouble();

        System.out.printf("CALCULANDO VALOR EM REAIS:(Base em IOF de %.2f%n)", Conversor.valorIOF);

        System.out.printf("O valor a ser pago em R$ é de: %.2f%n",Conversor.valorReais());
    }
}
