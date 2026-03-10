package secao08;


import secao08.Entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Ex03Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite as 3 notas de cada Trimestre:");
        aluno.n1 =  sc.nextDouble();
        aluno.n2 =  sc.nextDouble();
        aluno.n3 =  sc.nextDouble();

        System.out.println("CALCULANDO NOTA FINAL e RESULTADO:");
        System.out.printf("Nota Final: %.2f%n", aluno.nFinal());

        System.out.printf("Resultado: %s%n", aluno.resultado());

        sc.close();
    }
}
