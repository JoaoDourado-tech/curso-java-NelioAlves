package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex03While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o Código do Combustível ou Finalize: 1. Álcool 2.Gasolina 3.Diesel 4.FIM");
        int codigo = sc.nextInt();
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("DIGITE UM VALOR VÁLIDO:  1. Álcool 2.Gasolina 3.Diesel 4.FIM");
                    codigo = sc.nextInt();
            }
            System.out.println("Digite o Código do Combustível: 1. Álcool 2.Gasolina 3.Diesel 4.FIM");
            codigo = sc.nextInt();


        }
        System.out.println("Finalizada Votação:");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
