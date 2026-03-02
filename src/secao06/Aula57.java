package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Aula57 {
    public static void main(String[] args) {
        //Estrutura de Repetião "FOR"
            // Usada quando se sabe a quantidade de repetições
            //Exemplo da Aula:
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que serão contados:");
        int num = sc.nextInt();
        int soma=0;
        for (int i = 0; i < num; i++) {
            System.out.println("Digite o número a ser somado:");
            int x = sc.nextInt();
            soma+=x;
        }
        System.out.printf("Contagem finalizada: a Soma total é %d", soma);



        sc.close();
    }
}
