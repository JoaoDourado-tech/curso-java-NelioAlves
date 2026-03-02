package secao05;

import java.util.Scanner;

public class Aula42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as Horas: ");
        int hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom Dia!");
        } else {
            if (hora < 18) {
                System.out.println("Bom Tarde!");
            } else {
                System.out.println("Bom Noite!");
            }
        }


        sc.close();
    }
}
