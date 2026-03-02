package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Salário:");
        double salario = sc.nextDouble();
        double imposto;
        double salFinal;
        if (salario <= 2000.00) {
            System.out.println("Isento de Imposto");
            System.out.printf("O salário Final é de: %.2f%n", salario);
        } else if (salario <= 3000.00) {
            System.out.println("8% de Imposto sobre o que Ultrapassa 2000R$");
            imposto = 1000.00 * 0.08;
            salFinal = salario - imposto;
            System.out.printf("Após a dedução do Imposto (%.2f R$) o Salário Final é de: %.2f%n", imposto, salFinal);
        } else if (salario <= 4500.00) {
            System.out.println("18% de Imposto sobre o que ultrapassar 3000R$");
            imposto =  1000.00 * 0.08 + 1500.00 * 0.18;
            salFinal = salario - imposto;
            System.out.printf("Imposto de %.2f, resultando em um Salário Final de %.2f%n", imposto, salFinal);
        } else if (salario > 4500.00) {
            System.out.println("Impsoto de 28% sobre o que ultrapassar 4500R$");
            imposto = (1000.00) * 0.08 + (1500.00) * 0.18 + (4500.00) * 0.28;
            salFinal = salario - imposto;
            System.out.printf("Imposto de %.2f, resultando em um Salário Final de %.2f%n", imposto, salFinal);
        }
        sc.close();
    }

}

