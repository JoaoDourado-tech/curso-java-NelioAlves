package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula46 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//COMO usar a estrutura Switch-Case:
        System.out.println("Digite um número de 1 a 7 equivalente aos dias da Semana: ");
        int num = sc.nextInt();
        String dia = switch (num) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Valor INDEFINIDO...";
        };

        System.out.printf("Dia da semana: %s", dia);

        sc.close();
    }
}
