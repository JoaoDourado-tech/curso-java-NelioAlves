package secao03;

import java.util.Scanner;

public class Aula34 {
    public static void main(String[] args) {
        //Ler texto até a QUEBRA DE LINHA
        Scanner sc = new Scanner(System.in);

        String s1,s2,s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); //Criado para absorver a Quebra de Linha gerada pelo nextInt()
        s1 = sc.nextLine();
        s2 = sc.nextLine(); //Diferentes de sc.next()
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //ATENÇÃO: Quebra de Linha PENDENTE no sc.nextInt do x

        sc.close();

    }
}
