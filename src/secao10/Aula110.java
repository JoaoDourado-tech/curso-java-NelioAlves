package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula110 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Matrizes, na Prática:
        System.out.println("Digite o TAMANHO da Matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //INSTANCIAÇÃO de uma Matriz Bidimensional[][] NxN

        List<Integer> negativos = new ArrayList<>(); //Armazenador dos números negativos

        List<Integer> diagonalPrincipal = new ArrayList<>();
        System.out.println();

        System.out.println("Digite os números da Matriz: ");

        for (int i = 0; i < n; i++) {  //Usa-se um FOR ANINHADO para cada DIMENSÃO da Matriz
            for (int j = 0; j < n; j++) { //Nesse caso por ser uma Matriz Bidimensional, há 2 FOR ANINHADOS
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    negativos.add(mat[i][j]);
                }
                if(i==j){
                    diagonalPrincipal.add(mat[i][j]);
                }
            }
        }

        System.out.println("Diagonal Principal: ");
        System.out.println(diagonalPrincipal);
        System.out.println();
        System.out.println("Números Negativos: ");
        System.out.println(negativos);








        sc.close();
    }
}
