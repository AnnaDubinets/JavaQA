package HomeWork_31_07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(now.format(dateFormatter) + ", " + now.getDayOfMonth() + ", " + now.getDayOfYear() + ", " + now.format(timeFormatter));
    }
}
