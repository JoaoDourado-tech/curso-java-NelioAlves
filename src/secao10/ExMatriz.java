package secao10;

import java.util.Locale;
import java.util.Scanner;

public class ExMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de LINHAS da Matriz: ");
        int L = sc.nextInt();
        System.out.print("Digite a quantidade de COLUNAS da Matriz: ");
        int C = sc.nextInt();

        int[][] mat = new int[L][C];

        System.out.println();

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Números da Matriz: ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Digite um Número CONTIDO na Matriz: ");

        int x = sc.nextInt();
        System.out.println();

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == x) {
                    System.out.println();
                    System.out.println("Posição: " + i + ", " + j);

                    if (j > 0) {
                        System.out.println("ESQUERDA: " + mat[i][j - 1]);
                    }
                    if (i > 0){
                        System.out.println("ACIMA: " + mat[i - 1][j]);
                    }
                    if (j < C-1) {
                        System.out.println("DIREITA: " + mat[i][j + 1]);
                    }
                    if (i < L-1) {
                        System.out.println("ABAIXO: " + mat[i + 1][j]);

                    }
                }
            }
        }
        sc.close();
        }
    }
