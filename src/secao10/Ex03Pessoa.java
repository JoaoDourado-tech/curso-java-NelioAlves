package secao10;

import secao10.Entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Ex03Pessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas a ser avaliadas:");
        int quantidade = sc.nextInt();

        Pessoa p;
        Pessoa[] vetorPessoa = new Pessoa[quantidade];
        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.println("Digite o NOME da Pessoa:");
            String nome = sc.nextLine();
            System.out.println("Digite a IDADE da Pessoa:");
            int idade = sc.nextInt();
            System.out.println("Digite a ALTURA da Pessoa: (Em METROS)");
            double altura = sc.nextDouble();

            p = new Pessoa(nome,idade,altura);
            p.setNome(nome);
            p.setIdade(idade);
            p.setAltura(altura);

            vetorPessoa[i] = p;
        }
        double somaAltura = 0;
        double mediaAltura = somaAltura/quantidade;


        System.out.printf("%n");

        System.out.println("Calculando a ALTURA MÉDIA:");
        for (int i = 0; i < quantidade; i++) {
            somaAltura += vetorPessoa[i].getAltura();
        }
        System.out.println("ALTURA MÉDIA: " + mediaAltura);

        System.out.printf("%n");

        System.out.println("Calculando Percentual de MENORES DE 16 ANOS:");
        int menor16 = 0;
        String[] nomeMenor16 = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            if (vetorPessoa[i].getIdade() < 16) {
                menor16 += 1;
                nomeMenor16[i] = vetorPessoa[i].getNome();
            }
        }
        double percentualMenor16 = ((double)menor16 / quantidade) * 100;
        System.out.println("Percentual de MENORES DE 16: " + percentualMenor16 + "%");
        System.out.println("Nome dos MENORES DE 16:");
        for (int i = 0; i < menor16; i++) {
            if (nomeMenor16[i] != null) {
                System.out.println(nomeMenor16[i]);
            }
        }






        sc.close();
    }
}
