package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Exe00 {
    public static void main(String[] args) {

        //Exercício Calcule a Área do Retângulo
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura; //Largura
        double altura; //Altura
        double area; //Área do Retângulo
        double valorM; //Valor do Metro Quadrado
        double preco; //Valor do Terreno

        //Calculando a Área:
        System.out.println("Digite a Largura: ");
        largura = sc.nextDouble();
        System.out.println("Digite a Altura: ");
        altura = sc.nextDouble();
        area = (largura * altura);
        System.out.printf("A área do retângulo é: %.2f%n", area);

        //Calculando Preço do Terreno:
        System.out.println("Insira o Valor do Metro Quadrado: ");
        valorM = sc.nextDouble();
        preco = area * valorM;
        System.out.printf("O Valor do Terreno é: %.2f%n", preco);

        sc.close();

    }
}
