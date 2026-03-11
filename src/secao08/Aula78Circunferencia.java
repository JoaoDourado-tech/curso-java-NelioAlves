package secao08;

import secao08.Entities.Circunferencia;

import java.util.Locale;
import java.util.Scanner;

public class Aula78Circunferencia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circunferencia circunferencia = new Circunferencia();

        System.out.println("Digite um RAIO de Circunferência:");
         circunferencia.raio = sc.nextDouble();

        System.out.printf("Perímetro da Circunferencia: %.2f%n", circunferencia.perimetro());

        System.out.printf("Volume da Circunferência: %.2f%n", circunferencia.volume());

        System.out.printf("Valor de PI: %.2f%n", Math.PI);
        sc.close();
    }
    /*
     METODO DIREITO na FUnção MAIN:
    public static double peri(double raio){
        return (2*Math.PI*raio);
    }
    public static double volume(double raio){
        return (((double) 4 / 3) * (Math.PI * (Math.pow(raio, 3))));
    }
     */
}
