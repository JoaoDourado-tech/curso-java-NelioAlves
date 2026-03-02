package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a Hora de Início do Jogo:");
        int horaInicio = sc.nextInt();
        System.out.println("Insira a Hora de Fim do Jogo:");
        int horaFim = sc.nextInt();
        int duracao;
        if (horaInicio < horaFim) {
            //Mesmo Dia
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }
        System.out.printf("Duração do Jogo foi de: %d", duracao);


        sc.close();
    }
}
