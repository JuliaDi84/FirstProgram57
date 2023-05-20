package datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Instant;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    //    LocalTime,LocalDate,LocalTimeDate,Instant
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        //convert epoch to current date; epoch tine nr de secunde de la 1970 pana in prezent;
        LocalTime ll = LocalTime.of(13,13,14);
        System.out.println(ll);
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }

}
