package HomeWork_24_05;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _3 {

    //4. Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
    //и заканчивается “A”. Используем функциональный интерфейс Predicate.



public static void main(String[] args) {
    Predicate<String> startsWithJorN = (s) -> s.startsWith("J") || s.startsWith("N");
    Predicate<String> endsWithA = (s) -> s.endsWith("A");

    String testString = "Java";

    if (startsWithJorN.and(endsWithA).test(testString)) {
        System.out.println("Строка начинается с “J” или “N” и заканчивается на “A”");
    } else {
        System.out.println("Строка не соответствует условиям");
    }
}

    //5.Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
    //“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.

    Function<Integer, String> numberSignChecker = (n) -> {
        if (n > 0) return "Положительное число";
        else if (n < 0) return "Отрицательное число";
        else return "Ноль";
    };


    //6.Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
    //Используем функциональный интерфейс Supplier.


    Supplier<Integer> randomSupplier = () -> new Random().nextInt(11);
}
