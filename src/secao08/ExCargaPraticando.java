package secao08;

import secao08.Entities.Carga;

import java.util.Locale;
import java.util.Scanner;

public class ExCargaPraticando {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Carga x = new Carga();

        System.out.println("Digite o Código do Volume: ");
        x.codigo = sc.nextInt();
        System.out.println("Digite o Destino do Volume:");
        x.destino = sc.next();
        System.out.println("Digite o peso do Volume:");
        x.peso = sc.nextDouble();

        System.out.println("CALCULANDO CUSTO DE VOO...");
        double custo = x.calcularCustoVoo();

        System.out.printf("Custo de Transporte do VOLUME (Nº %d) é de: %.2f%n R$", x.codigo, custo);

    }
}
