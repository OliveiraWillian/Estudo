import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        /* Brincado com a data
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
         */

        // Fim brincando com datas

        /*LocalDate d01 = LocalDate.now(); // DATA LOCAL SOMENTE
        LocalDateTime d02 = LocalDateTime.now(); // DATA + HORAS LOCAL
        Instant d03 = Instant.now(); // DATA + HORAS GLOBAL
        //texto iso 8601 - data-hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:16");
        Instant d06 = Instant.parse("2022-07-20T01:30:16z");
        Instant d07 = Instant.parse("2022-07-20T01:30:16-03:00");
// texto formato customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);

        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 07, 20);

        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);*/

      //  Instant d03 = Instant.now(); // DATA + HORAS GLOBAL
        //texto iso 8601 - data-hora
/*

        LocalDate d04 = LocalDate.parse("2022-07-20");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(fmt1));

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:16");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d05.format(fmt2));

        Instant d06 = Instant.parse("2022-07-20T01:30:26z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// converte para fuso horario do pc
        System.out.println(fmt3.format(d06));
*/
        /* 
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:16");
        Instant d06 = Instant.parse("2022-07-20T01:30:16z");

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault()); // converte para fuso horario do pc
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());// converte para fuso horario do pc
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getMonthValue());
        System.out.println(d04.getYear());
        System.out.println(d05.getHour());
        System.out.println(d05.getMinute());
*/
// calculos com data-hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:16");
        Instant d06 = Instant.parse("2022-07-20T01:30:16z");
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println(nextWeekLocalDate);
        System.out.println(pastWeekLocalDate);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println(nextWeekLocalDateTime);
        System.out.println(pastWeekLocalDateTime);

        Instant pastInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println(pastInstant);
        System.out.println(nextInstant);


        //Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(d06,nextInstant);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
    }
}