package secao03;

import java.util.Locale;
import java.util.Scanner;

public class PraticaAula34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Número da Matrícula: ");
        int matricula = sc.nextInt();
        System.out.println("Matrícula: " + matricula);

        System.out.println("Digite sua Altura: ");
        double alt = sc.nextDouble();
        System.out.println("Altura: " + alt);

        System.out.println("Digite seu Nome Completo: ");
        sc.nextLine(); //Limpar Buffer
        String nomeCompleto = sc.nextLine();
        System.out.println("Seu Nome é: " + nomeCompleto);

        System.out.println("Digite seu Esquadrão: ");
        String esquad = sc.next();
        System.out.println("Seu Esquadrão: " + esquad);

        System.out.println("Relatório Final de Dados: ");
        System.out.println("Matricula: " + matricula);
        System.out.println("Altura: " + alt);
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Esquadrão: " + esquad);

        sc.close();

    }
}
