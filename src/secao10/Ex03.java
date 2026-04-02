package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem avaliadas:");
        int numPessoas = sc.nextInt();

        double somaAltura = 0;
        int menorIdade16 = 0;

        String[] nomeMenor = new String[numPessoas];

        for (int i=0; i<numPessoas; i++){
            System.out.printf("Dados da %dª Pessoa: ", i + 1);
            sc.nextLine();

            System.out.print("Nome: ");
            String nomePessoa = sc.nextLine();

            System.out.print("Idade: ");
            int idadePessoa = sc.nextInt();

            if (idadePessoa < 16) {
                menorIdade16 += 1;
                nomeMenor[i] = nomePessoa;
            }

            System.out.println("Altura:");
            double alturaPessoa = sc.nextDouble();

            somaAltura += alturaPessoa;
        }



        double mediaAltura = somaAltura/numPessoas;
        double percentIdade16 =  ((double)menorIdade16 / numPessoas) * 100;

        System.out.printf("Altura Média: %.2f%n ", mediaAltura);
        System.out.printf("Porcentagem menor de 16 anos: " + percentIdade16 + "%");
        for (int i=0; i<numPessoas; i++){
            if (nomeMenor[i] != null){
                System.out.printf("Nomes menores de 16 anos: "+nomeMenor[i]);
            }
        }



        sc.close();
    }
}
