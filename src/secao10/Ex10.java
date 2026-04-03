package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos avaliados:");
        int quantAlunos = sc.nextInt();

        double[] nota1 = new double[quantAlunos];
        double[] nota2 = new double[quantAlunos];
        String[] nome = new String[quantAlunos];

        for(int i = 0; i < quantAlunos; i++){
            sc.nextLine();
            System.out.printf("Digite o nome do %dº Aluno: ", i + 1);
            nome[i] = sc.nextLine();
            System.out.println("Digite a 1ª nota do aluno: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Digite a 2ª do Aluno: ");
            nota2[i] = sc.nextDouble();
            }
        for(int i = 0; i < quantAlunos; i++){
            double media = (nota1[i]+nota2[i])/2;
            if(media>=6){
                System.out.printf("Aluno Aprovado: %s com a Nota Final de %.2f%n",nome[i],media);
            } else {
                System.out.printf("Aluno Reprovado: %s com a Nota Final de %.2f%n ", nome[i], media);
            }
        }


        sc.close();
        }
    }
