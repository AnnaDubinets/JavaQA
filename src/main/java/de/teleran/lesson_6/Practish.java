package de.teleran.lesson_6;


//Возьмите список, измените все элементы в нем на новое значение
//вам дан список значений
//вы должны применить определенную операцию для изменения каждого значения
//вернуть список со всеми этими измененными значениями

import java.util.ArrayList;
import java.util.List;

public class Practish {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("mila");
        list.add("ramy");

        for (int i = 0; i < list.size(); i++) {
            String elem = list.get(i);
            elem = elem+"1";
            list.set(i, elem);;
        }
        System.out.println(list);
    }
}
