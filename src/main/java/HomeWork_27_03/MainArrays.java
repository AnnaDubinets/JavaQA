package HomeWork_27_03;

import java.util.ArrayList;
import java.util.Iterator;

public class MainArrays {
    public static void main(String[] args) {
        // Создаем ArrayList с элементами
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Найти сумму всех элементов ArrayList
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);

        // Найти среднее значение элементов ArrayList
        double average = (double) sum / arrayList.size();
        System.out.println("Среднее значение элементов: " + average);

        // Перебрать ArrayList и найти наименьший элемент
        int min = arrayList.get(0);
        for (int num : arrayList) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Наименьший элемент: " + min);

        // Перебрать ArrayList и найти сумму квадратов всех элементов
        int squareSum = 0;
        for (int num : arrayList) {
            squareSum += num * num;
        }
        System.out.println("Сумма квадратов всех элементов: " + squareSum);

        // Перебрать ArrayList и удалить все четные числа
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("ArrayList после удаления четных чисел: " + arrayList);

        // Перебрать ArrayList и найти второй по величине элемент
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int num : arrayList) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Второй по величине элемент: " + secondLargest);


        char targetChar = 'a'; // Задаем целевую букву
        int count = 0;
        for (int num : arrayList) {
            if (String.valueOf(num).startsWith(String.valueOf(targetChar))) {
                count++;
            }
        }
        System.out.println("Количество элементов, начинающихся с буквы '" + targetChar + "': " + count);

        // Перебрать ArrayList и объединить все элементы в одну строку
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : arrayList) {
            stringBuilder.append(num);
        }
        String combinedString = stringBuilder.toString();
        System.out.println("Объединенные элементы: " + combinedString);

        // Перебрать ArrayList и найти самую короткую строку
        String shortestString = null;
        for (int num : arrayList) {
            String str = String.valueOf(num);
            shortestString = str;
        }
        System.out.println("Самая короткая строка: " + shortestString);
    }
}




