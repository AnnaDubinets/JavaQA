package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _11 {

    //Задание 11: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        char filterChar = 'a'; // или 'A', если требуется регистронезависимая фильтрация
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.toLowerCase().startsWith(String.valueOf(filterChar).toLowerCase()))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}
