package secao03;

import java.util.Locale;

public class Aula35 {
    public static void main(String[] args) {
        System.out.println("Funções Matemáticas:");
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        //Como Calcular a Raiz Quadrada:
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de 3.0 é = " + A);
        System.out.println("Raiz quadrada de 4.0 é = " + B);
        System.out.println("Raiz quadrada de 25.0 é = " + C);

        //Como Calcular a Potência:
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x+" Elevado a "+ y + " = "+ A);
        System.out.println(x + " Elevado a " + 2.0 + " = " + B);
        System.out.println(5.0 + " Elevado a " + 2.0 + " = " + C);

        //Como Calcular o Valor Absoluto:
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor Absoluto de " + y + " = " + A);
        System.out.println("Valor Absoluto de " + z + " = " + B);

        //Informações sobre TODAS as funções matemáticasem: java.lang.Math
    }
}

