package secao06;

import java.util.Locale;
import java.util.Scanner;

public class ExDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Temperatura Fahrenheit");

        char repetir;
        do{
            System.out.println("Digite a temperatura em Celsius:");
            double celsius = sc.nextDouble();

            double Fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("Temperatura em ºF: %.1f%n ",Fahrenheit);

            System.out.println("Quer calcular novamente? (sim/não)");
            repetir = sc.next().charAt(0);
        } while (repetir == 's');

        //Usando apenas WHILE:
        /*char repetir = 's';
        while(repetir != 'n'){
            System.out.println("Digite a temperatura em Celsius:");
            double celsius = sc.nextDouble();

            double Fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("Temperatura em ºF: %.2f%n ",Fahrenheit);

            System.out.println("Quer calcular novamente? (sim/não)");
            repetir = sc.next().charAt(0);

         */
        }
    }