package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de Números a serem avaliados:");
        int num = sc.nextInt();
        double[] vetorNum = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Digite um Número Real:");
            vetorNum[i] = sc.nextDouble();
            }
        double maiorNum = vetorNum[0];
        int posicaoMaior = 0;

        for (int i = 0; i < num; i++) {
            if(vetorNum[i]>maiorNum){
                maiorNum = vetorNum[i];
                posicaoMaior = i;
            }
        }
        System.out.println("MAIOR NÚMERO:" + maiorNum);
        System.out.println("POSIÇÃO MAIOR NÚMERO:" + posicaoMaior);










        sc.close();
    }
}
