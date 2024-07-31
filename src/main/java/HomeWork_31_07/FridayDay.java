package HomeWork_31_07;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDay {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1985, 1, 10);
        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();

        System.out.println("10 Января 1985 года - это " + dayOfWeek);

        LocalDate anotherDate = LocalDate.of(2023, 7, 31);
        System.out.println("31 Июля 2023 года - это " + anotherDate.getDayOfWeek());
    }
}
