package de.teleran.lesson_6;

//Возьмите список, удалите все элементы, которые не соответствуют определенным критериям.
//вам дан список значений
//у вас есть критерии для этих значений
//вернуть список только с теми значениями из исходного списка, которые соответствуют этим критериям

import java.util.ArrayList;
import java.util.List;

public class Practish_1 {
    public class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
