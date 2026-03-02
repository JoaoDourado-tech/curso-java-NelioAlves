package secao03;

import java.util.Locale;
import java.util.Scanner;

public class ExecBhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Construir Fórmula de Bhaskara:
        double delta;
        double a;
        double b;
        double c;
        double x1;
        double x2;

        System.out.println("Insira o Valor de A, B e C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - (4 * a * c);
        System.out.println("Valor de Delta é: " + delta);


        x1 = (-b - Math.sqrt(delta))/(2.0*a);
        x2 = (-b + Math.sqrt(delta))/(2.0*a);
        System.out.println("Calculando Bhaskara X1 e X2:");
        System.out.println("Valor de X1 = " + x1);
        System.out.println("Valor de X2 = " + x2);



        sc.close();
    }
}
