package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão avaliadas?");
        int num = sc.nextInt();

        double[] altura = new double[num];
        char[] genero =  new char[num];

        double menorAltura;
        double maiorAltura;

        double mediaF = 0;
        double somaF = 0;

        int quantM = 0;
        int quantF = 0;



        for (int i = 0; i < num; i++) {
            System.out.println("Digite o GÊNERO (M/F): ");
            genero[i] = sc.next().charAt(0);
            System.out.println("Digite o ALTURA:");
            altura[i] = sc.nextDouble();

            if (genero[i] == 'F'){
                somaF += altura[i];
                quantF++;
            }

            if (genero[i] == 'M'){
                quantM++;
            }
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];
        for (int i = 0; i < num; i++) {
            if(menorAltura > altura[i]){
                menorAltura=altura[i];
            }
            if (maiorAltura < altura[i]){
                maiorAltura = altura[i];
            }
        }

        if (quantF != 0) {
            mediaF = somaF/quantF;
        } else {
            System.out.println("NÃO HÁ MULHERES...");
        }

        System.out.printf("MAIOR ALTURA: %.2f%n", maiorAltura);
        System.out.printf("MENOR ALTURA: %.2f%n", menorAltura);

        System.out.printf("Média da Altura FEMININA: %.2f%n", mediaF);

        System.out.printf("QUANTIDADE DE HOMENS: %d%n", quantM);






        sc.close();

    }
}
