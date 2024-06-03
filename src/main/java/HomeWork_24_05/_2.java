package HomeWork_24_05;

import java.util.function.Predicate;

public class _2 {
    //1.Создать лямбда выражение, которое возвращает значение true,
    //если строка не null, используя функциональный интерфейс Predicate.

    Predicate<String> isNotNull = (s) -> s != null;

    //2. Создать лямбда выражение, которое проверяет, что строка не пуста,
    //используя функциональный интерфейс Predicate.

    Predicate<String> isNotEmpty = (s) -> s != null && !s.isEmpty();

    //3.Написать программу проверяющую, что строка не null и не пуста,используя функциональный интерфейс Predicate.

    public static void main(String[] args) {
        Predicate<String> isNotNull = (s) -> s != null;
        Predicate<String> isNotEmpty = (s) -> s != null && !s.isEmpty();

        String testString = "Hello";

        if (isNotNull.and(isNotEmpty).test(testString)) {
            System.out.println("Строка не null и не пуста");
        } else {
            System.out.println("Строка null или пуста");
        }
    }

}