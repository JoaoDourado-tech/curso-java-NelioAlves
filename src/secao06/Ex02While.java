package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex02While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Leitor de Coordenadas Cartesianas:");

        System.out.println("Digite duas Coordenadas:");
        int x = sc.nextInt();
        int y = sc.nextInt();


        while ( x!=0 && y!=0){
            System.out.println("(" + x + "," + y + ")");
            if (x>0 && y>0){
                System.out.println("1ºQuadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("2ºQuadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("3ºQuadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("4ºQuadrante");
            }
            System.out.println("Digite duas Coordenadas:");
            x = sc.nextInt();
            y = sc.nextInt();


        }
        sc.close();
    }
}
