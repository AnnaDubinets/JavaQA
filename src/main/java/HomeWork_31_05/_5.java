package HomeWork_31_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5 {

    //Задание 5: Пропуск первых двух элементов и вывод оставшихся

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        List<String> skippedStrings = strings.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skippedStrings);
    }
}
