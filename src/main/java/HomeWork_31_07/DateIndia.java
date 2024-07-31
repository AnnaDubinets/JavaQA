package HomeWork_31_07;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateIndia {
    public static void main(String[] args) {
        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime indiaTime = now.atZone(indiaZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current date and time in India: " + indiaTime.format(formatter));
    }
}
