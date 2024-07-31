package HomeWork_31_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Minus10Years {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1985, 1, 10);
        LocalDate newDate = birthDate.minusYears(10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));

        System.out.println("Дата 10 лет назад от даты рождения: " + newDate.format(formatter));
    }
}
