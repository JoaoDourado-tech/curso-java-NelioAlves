package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro NEGATIVO ou POSITIVO: ");
        int num = sc.nextInt();
        if (num<0){
            System.out.printf("O número %d é NEGATIVO!", num);
        } else {
            System.out.printf("O número %d é NÃO NEGATIVO!", num);
        }
        sc.close();

    }
}
