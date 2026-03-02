package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("O número %d é PAR!", num);
        } else{
            System.out.printf("O número %d é IMPAR!", num);
        }
        sc.close();
        
    }
}
