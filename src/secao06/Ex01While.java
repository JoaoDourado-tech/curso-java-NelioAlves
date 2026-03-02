package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex01While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.println("Digite o seu senha: ");
        senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("SENHA INVÁLIDA");
            senha = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO");
        sc.close();
    }
}
