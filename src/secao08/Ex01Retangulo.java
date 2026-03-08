package secao08;

import java.util.Locale;
import java.util.Scanner;
import secao08.Entities.Retangulo;


public class Ex01Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da LARGURA:");
        retangulo.largura = sc.nextDouble();
        System.out.println("Digite o valor da ALTURA:");
        retangulo.altura = sc.nextDouble();

        System.out.println("CALCULANDO DADOS:");
        System.out.println(retangulo);







        sc.close();
    }
}
