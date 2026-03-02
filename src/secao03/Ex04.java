package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Número do Funcionário:");
        int funcionario_num = sc.nextInt();
        System.out.println("Insira o número de horas trabalhadas: ");
        double horas_trabalhadas = sc.nextDouble();
        System.out.println("Informe o Valor da Hora trablahada:");
        double valor_hora = sc.nextDouble();

        System.out.println("CALCULANDO SALÁRIO Funcionário " + funcionario_num + ":");
        double salario = valor_hora * horas_trabalhadas;
        System.out.printf("Salário = %.2f%n", salario);
        sc.close();
    }
}
