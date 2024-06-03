package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _10 {

    //Задание 10: Сортировка списка чисел в порядке убывания и выбор первых трех элементов

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        List<Integer> topThreeNumbers = numbers.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(topThreeNumbers);
    }
}
