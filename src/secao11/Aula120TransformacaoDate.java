package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula120TransformacaoDate {
    public static void main(String[] args) {

        /*
        Comando para ver TODAS as Nomenclaturas de Fusos Países:
        for ( String x : ZoneId.getAvailableZoneIds(){
            System.out.printls(x);
        }
         */

        LocalDate d04 = LocalDate.parse("2026-04-14");
        LocalDateTime d05 = LocalDateTime.parse("2026-04-14T01:30:25");
        Instant d06 = Instant.parse("2026-04-14T01:30:25Z");

//--------------------------------------------------------------------------------------------------
        //Converter um DATE GLOBAL em DATE LOCAL:
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //Usa o Zulu do meu sistema
        System.out.println("r1 = " + r1);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // Usar nomenclatura de cada fuso/país visto no comando


        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r3 = " + r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r4 = " + r4);
//-------------------------------------------------------------------------------------------------
        //Pegar Elementos de uma Data (Dia, Mês ou Ano):

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 Mês = " + d04.getMonthValue());
        System.out.println("d04 Ano = " + d04.getYear());

        System.out.println("d05 Hora = " + d05.getHour());





    }
}
