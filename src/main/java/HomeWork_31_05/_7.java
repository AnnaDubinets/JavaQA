package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;

public class _7 {

    //Задание 7: Суммирование списка чисел

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
    }
}
