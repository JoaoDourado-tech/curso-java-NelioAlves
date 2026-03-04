package secao07;

import java.util.Locale;
import java.util.Scanner;

public class CalculoLogistica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Distância Total: (Em KM)");
        double distanciaTotal = sc.nextDouble();
        System.out.println("Digite o Consumo Médio: (Em KM/L");
        double consumoMedio = sc.nextDouble(); //Em Km/l
        System.out.println("Preço do Combustível: (Em R$)");
        double precoCombustivel = sc.nextDouble();


        System.out.println("Calculando o TOTAL DE LITROS necessário para a Missão:");
        double totalLitros = calcularLitros(distanciaTotal, consumoMedio);
        System.out.printf("Total de Litros: %.2f%n", totalLitros);

        System.out.println("Calculando o CUSTO TOTAL da Missão:");
        double custoTotal = calcularCusto(totalLitros, precoCombustivel);
        System.out.printf("Total da Custo: %.2f%n", custoTotal);

        sc.close();
    }

    //Função para calcular o Consumo Médio:
    public static double calcularLitros(double distancia, double consumo) {
        return (distancia / consumo);
    }

    //Função para calcular o custo:
    public static double calcularCusto(double litros, double preco) {
        return (litros * preco);
    }
}
