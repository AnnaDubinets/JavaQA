package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _12 {

    //Задание 12: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "berry", "cherry", "banana", "apple");
        List<String> uniqueLongWords = strings.stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueLongWords);
    }
}
