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

        System.out.println("Informe a quantidade de funcionários que serão REGISTRADOS: ");
        int quantFuncionarios = sc.nextInt();

        List<Empregado> listEmpregados = new ArrayList<>();
        Empregado  empregado;

        for (int i = 0; i < quantFuncionarios; i++) {
            System.out.println("CÓDIGO FUNCIONÁRIO: ");
            int idFuncionario = sc.nextInt();
            System.out.println("NOME FUNCIONÁRIO: ");
            sc.nextLine();
            String nomeFuncionario = sc.nextLine();
            System.out.println("SALARIO FUNCIONARIO: ");
            double salarioFuncionario = sc.nextDouble();

            empregado = new Empregado (idFuncionario, nomeFuncionario, salarioFuncionario);

            listEmpregados.add(empregado);
        }

        System.out.println("SISTEMA DE BUSCA FUNCIONARIOS:");
        System.out.println("Informe o ID BUSCADO: ");
        int idBuscado = sc.nextInt();

        Empregado empregadoBuscado = listEmpregados.stream().filter(x->x.getId() == idBuscado).findFirst().orElse(null);

        if (empregadoBuscado == null) {
            System.out.println("ID INVÁLIDO");

        } else {
            System.out.println("AUMENTO SALARIAL: ");
            System.out.println("informe o percentual de aumento:");
            double porcentagem = sc.nextDouble();
            empregadoBuscado.aumentarSalario(porcentagem);
        }

        for (Empregado x : listEmpregados) {
            System.out.println(x);
        }







        sc.close();
    }
}
