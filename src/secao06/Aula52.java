package secao06;

import java.util.Scanner;

public class Aula52 {
    public static void main(String[] args) {
        //Estrutura Repetitiva "WHILE"
            //Usar while quando NÃO se sabe a quantidade de repetições
            // Se TRUE mantém o LOOP, se FALSE rompe o LOOP
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();
        int soma = 0;
        while (num != 0){
            System.out.println("Digite NOVAMENTE um número:");
            num = sc.nextInt();
            soma += num;
            //Repete-se INFINITAMENTE enquanto não se digitar o ZERO.
            //Soma-se todos os números.
        }
        System.out.printf("Digitou %d: PROGRAMA FINALIZADO!", num);
        System.out.println("Soma dos Números: " + soma);

        sc.close();
    }
}

//Exemplo de Compreensão WHILE:
/* function comerPizza(){
        while(temFatia){
            comerFatia()
            }
           }
 */

// Características do While:
        // Executa a análise de condição logo no INÍCIO;
                //Diferente do seu irmão patinho feio, DO-WHILE, que executa a condição no FINAL;
        // Usado para repetições INDEFINIDAS;

