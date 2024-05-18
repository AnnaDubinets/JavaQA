package de.teleran.HomeWork_18_05;

public class Cat {

        String name;
        int age;
        double weight;
        String breed;

        public Cat(String name, int age, double weight, String breed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.breed = breed;
        }

        @Override
        public String toString() {
            return "Cat{name='" + name + "', age=" + age + ", weight=" + weight + ", breed='" + breed + "'}";
        }
    }

