package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula45 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tempo em minutos de TELEFONE:");
        int tempo = sc.nextInt();
        double pagar = 50.0;
//Usando o Operador ACUMULATIVO (+=)
        if (tempo > 100) {
            pagar += (tempo - 100)*2; //Vai somar aos 50.0$ o adicional
        }
        System.out.printf("O valor a ser pago é de: %.2f%n", pagar);

        sc.close();
    }
}
