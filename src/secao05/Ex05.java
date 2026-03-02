package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do Item: ");
        int code = sc.nextInt();

        String nome;
        double valor;

        switch (code) {
            case 1:
                nome = "Cachorro Quente";
                valor = 4.00;
                break;
            case 2:
                nome = "X-salada";
                valor = 4.50;
                break;
            case 3:
                nome = "X-Bacon";
                valor = 5.00;
                break;
            case 4:
                nome = "Torrada Simples";
                valor = 2.00;
                break;
            case 5:
                nome = "Refrigerante";
                valor = 1.50;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        }
        System.out.printf("Insira a quantidade do Produto %s: ", nome);
        int quant = sc.nextInt();

        System.out.println("CALCULANDO O PREÇO...");
        double total = (quant * valor);
        System.out.printf("%d de %s custará um Total de: %.2f%n R$", quant, nome, total);
        sc.close();

    }
}
