package secao10;


import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de Pessoas avaliadas:");
        int numPessoas = sc.nextInt();

        String[] nome = new String[numPessoas];
        int[] idade = new int[numPessoas];

        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        for (int i=0; i<numPessoas; i++){
            System.out.printf("Dados da %dª Pessoa:", i+1);
            sc.nextLine();
            nome[i]=sc.nextLine();
            idade[i]=sc.nextInt();
            if (idade[i]>maiorIdade){
                maiorIdade=idade[i];
                nomeMaiorIdade=nome[i];
            }
        }
        System.out.printf("A pessoa MAIS VELHA: É a %s com %d anos", nomeMaiorIdade,maiorIdade);

        sc.close();
    }
}
