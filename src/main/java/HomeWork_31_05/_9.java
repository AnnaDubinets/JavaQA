package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _9 {

    //Задание 9: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}
