package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula118ComandosDATE {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDate d01 = LocalDate.now(); //DATA-HORA LOCAL atual
        System.out.println("d01 = " + d01);

        LocalDateTime d02 = LocalDateTime.now(); //DATA-HORA LOCAL atual
        System.out.println("d02 = " + d02);

        Instant d03 = Instant.now(); // Data-Hora GLOBAL atual
        System.out.println("d03 = " + d03);

        LocalDate d04 = LocalDate.parse("2026-04-14"); // Padrão ISO 8601
        System.out.println("d04 = " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2026-04-14T08:17"); // Padrão ISO 8601 com HORA EM ZULU
        System.out.println("d05 = " + d05);

        Instant d06 = Instant.parse("2026-04-14T08:17:00Z"); // Data-Hora GLOBAL digitada
        System.out.println("d06 = " + d06);

        Instant d07 = Instant.parse("2026-04-14T08:17:00-03:00"); //Data-Hora GLOBAL com o Horário Local
        System.out.println("d07 = " + d07);


//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
        //Link com Dados de Formatação de Datas e PADRÕES DE LETRAS para criar modelos

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Cria um FORMATO DE DATA

       // LocalDate d08 = LocalDate.parse("14/04/26"); Dará ERRO...
       // System.out.println("d08 = " + d08);

        LocalDate d08 = LocalDate.parse("14/04/2026", fmt1); //Agora não dará erro
        System.out.println("d08 = " + d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato CRIADO com Hora
        LocalDateTime d09 = LocalDateTime.parse("14/04/2026 05:35", fmt2);
        System.out.println("d09 = " + d09);


        LocalDate d10 = LocalDate.of(2026, 4, 14);
        System.out.println("d10 = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2026, 4, 14, 05, 48);
        System.out.println("d11 = " + d11);













    }


}
