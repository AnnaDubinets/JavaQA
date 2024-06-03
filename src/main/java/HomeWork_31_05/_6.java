package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6 {

    //Задание 6: Преобразование списка строк в список чисел

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numbers = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
