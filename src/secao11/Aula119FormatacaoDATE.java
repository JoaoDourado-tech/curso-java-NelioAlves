package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula119FormatacaoDATE {
    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2026-04-14"); // Padrão ISO 8601

        LocalDateTime d05 = LocalDateTime.parse("2026-04-14T08:17"); // Padrão ISO 8601 com HORA EM ZULU

        Instant d06 = Instant.parse("2026-04-14T08:17:00Z"); // Data-Hora GLOBAL digitada

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d04 = " + d04.format(fmt1));
        // OU
        System.out.println("d04 = " + fmt1.format(d04));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d04 = " + d05.format(fmt1));

        //OU
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt1.format(d05));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d06 = "+ fmt3.format(d06)); //Sem fmt irá dar erro




    }
}
