package secao08;

import java.util.Locale;
import java.util.Scanner;
import secao08.Entities.Funcionario;

public class Ex02Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.println("Digite o NOME do Funcionário: ");
        f.nome = sc.nextLine();
        System.out.println("Digite o SALÁRIO BRUTO: ");
        f.salBruto = sc.nextDouble();
        System.out.println("Digite o valor do IMPOSTO cobrado: (EM R$) ");
        f.imposto = sc.nextDouble();

        System.out.println(f);

        System.out.println("Digite o percentual de AUMENTO SALARIAL: (APENAS O NÚMERO, SEM %)");
        double percent = sc.nextDouble();

        System.out.printf("%n");

        System.out.println("CALCULANDO AUMENTO...");
        f.salAumento(percent);

        System.out.println(f);








        sc.close();
    }
}
