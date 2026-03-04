package secao07;

import java.util.Locale;
import java.util.Scanner;

public class ExFuncao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        //Usando IF-ELSE:
//        if (n1 > n2 && n1 > n3) {
//            System.out.println("O maior é:" + n1);
//        } else if (n2 > n3) {
//            System.out.println("O maior é:" + n2);
//        } else {
//            System.out.println("O maior é:" + n3);
//        }

        //Delegando essa lógica a uma FUNÇÃO:
            //Criando uma função que execute a lógica desse mesmo IF-ELSE
        int higher = max(n1, n2, n3);
        showResult(higher);


        sc.close();
    }

    //public - permite que a função fique disponível em outras classes
    //static - permite que a função possa ser chamada independente de se criar um objeto
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux; //Valor armazenado na int higher
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }



}
