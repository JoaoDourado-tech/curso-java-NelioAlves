package secao10;

import secao10.Entidades.Registro;

import java.util.Locale;
import java.util.Scanner;

public class ExPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int lugar = 10;
        System.out.println("Informe a QUANTIDADE DE ESTUDANTES para Hospedar: (De 1 a 10, no MÁX) ");
        int estudante = sc.nextInt();

        Registro r;
        Registro[] vetorRegistro = new Registro[lugar];
        String nome;
        String email;
        int quarto;

        for (int i=0; i<estudante; i++){
            sc.nextLine();
            System.out.println("Informe o Nome do registro:");
            nome = sc.nextLine();
            System.out.println("Informe o Email do registro:");
            email = sc.next();
            System.out.println("Informe o Nº do Quarto: (0 a 9):");
            quarto = sc.nextInt();

            r = new Registro(nome,email,quarto);

            vetorRegistro[quarto] = r;
        }

        System.out.println("RELATÓRIO DAS OCUPAÇÕES:");

        for (int i=0; i<lugar; i++){
            if(vetorRegistro[i]!=null){
                System.out.printf("QUARTO %d%n ", i);
                System.out.println("NOME: "+vetorRegistro[i].getNome());
                System.out.println("EMAIL: "+vetorRegistro[i].getEmail());
                System.out.println("QUARTO: "+vetorRegistro[i].getQuarto());
            }

        }















        sc.close();
    }
}
