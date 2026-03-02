package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Ex06For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número que lhe mostro seus divisores:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("É divisor: "+i);
            } else {
                System.out.println(i + " NÃO é divisor.");
            }
        }
        System.out.println("Finalizado.");
        }
        //Usando ARRAY:
        /*
        System.out.println("Digite um número que eu te digo os Divisores Interios:");
        int n = sc.nextInt();
        int[] nDivisores = new int[n];

        for(int i = 1; i<=n; i++){
            if (n % i == 0) { //Se o RESTO da div for 0
                nDivisores[(i-1)] = i; //armazenando os divisores em um Array
            }
        }
        System.out.println("Divisores de " + n);
        for (int i = 0; i < nDivisores.length; i++) { //Mostrador de cada um dos elementos do array
            System.out.println(nDivisores[i]);
        }

        sc.close();
    }

     */

}
