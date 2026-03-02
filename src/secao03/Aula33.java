package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Aula33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //String
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Digitei o valor: " + x);

        //Número Inteiro
        int y;
        y = sc.nextInt();
        System.out.println("O número digitado é: " + y);

        //Número Double
        double z;
        z = sc.nextDouble();
        System.out.println("A fração digitada é: " + z);

        //Character
        char w;
        w = sc.next().charAt(2);
        System.out.println("Você digitou: "+ w);

        //Vários dados na mesma linha
        x=sc.next();
        y=sc.nextInt();
        z=sc.nextDouble();
        System.out.println("Todos na mesma Linha: " + x + ", " + y + ", " + z);

        sc.close();
    }
}
