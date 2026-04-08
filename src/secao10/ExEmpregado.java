package secao10;

import secao10.Entidades.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExEmpregado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos empregados serão registrados:");
        int quant =  sc.nextInt();

        List<Empregado> listEmpregado = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.printf("Empregado #%d: \n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            listEmpregado.add(new Empregado(id, nome, salario));
        }

        System.out.println("Informe o ID do Empregado que terá AUMENTO SALARIAL: ");
        int idProcurado = sc.nextInt();
        Empregado procurado = listEmpregado.stream().filter(x -> x.getId() == idProcurado).findFirst().orElse(null);

        if (procurado == null) {
            System.out.println("ID NÃO EXISTE!");

        } else {
            System.out.println("ID: " + procurado.getId());
            System.out.println("Informe a porcentagem de AUMENTO SALARIAL: ");
            double porcentagem = sc.nextDouble();
            procurado.aumentarSalario(porcentagem);
        }
        for (Empregado x : listEmpregado) {
            System.out.println(x);
        }

        sc.close();
    }
}
