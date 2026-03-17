package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Aula96 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o número de Pessoas avaliadas:");
        int numPessoas = sc.nextInt();

        double[] altura = new double[numPessoas];
        double soma = 0;
        double media;
        for(int i=0; i<numPessoas; i++){
            System.out.println("Digite a altura da pessoa: ");
            altura[i] = sc.nextDouble();
            soma += altura[i];
        }
        media = soma/numPessoas;
        System.out.printf("Média das Alturas: %.2f%n", media);

        sc.close();
    
    }
}
