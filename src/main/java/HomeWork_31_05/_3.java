package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _3 {

    //Задание 3: Фильтрация чисел больше 50 и вывод их квадратов

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        List<Integer> squaredNumbers = numbers.stream()
                .filter(n -> n > 50)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}
