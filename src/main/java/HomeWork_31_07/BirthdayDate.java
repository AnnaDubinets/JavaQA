package HomeWork_31_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthdayDate {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1989, 10, 7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));

        System.out.println("Дата рождения: " + birthDate.format(formatter));
    }
}
