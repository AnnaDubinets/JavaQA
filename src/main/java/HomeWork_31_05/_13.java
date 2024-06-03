package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;

public class _13 {

    //Задание 13: Нахождение суммы чисел, кратных 3 и 5, из списка чисел


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 30, 45, 60, 75, 90, 105);
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
    }
}

