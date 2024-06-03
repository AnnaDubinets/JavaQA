package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4 {

    //Задание 4: Удаление дубликатов из списка строк

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueStrings);
    }
}
