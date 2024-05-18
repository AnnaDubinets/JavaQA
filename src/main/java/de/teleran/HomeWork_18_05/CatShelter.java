package de.teleran.HomeWork_18_05;

import java.util.Map;
import java.util.TreeMap;

public class CatShelter {
    public static void main(String[] args) {
        Map<String, Cat> cats = new TreeMap<>();
        cats.put("Milo", new Cat("Milo", 5, 4.5, "Siamese"));
        cats.put("Bella", new Cat("Bella", 3, 3.5, "Persian"));
        cats.put("Oliver", new Cat("Oliver", 4, 4.0, "Maine Coon"));
        cats.put("Leo", new Cat("Leo", 2, 5.0, "Sphynx"));

        // имена котов, порода которых = Persian
        String breedN = "Persian";
        System.out.println("Cats with breed " + breedN + ":");
        for (Cat cat : cats.values()) {
            if (cat.breed.equals(breedN)) {
                System.out.println(cat.name);
            }
        }

        // cписок всех котов, вес которых больше> 4.0
        double weightM = 4.0;
        System.out.println("Cats with weight greater than " + weightM + ":");
        for (Cat cat : cats.values()) {
            if (cat.weight > weightM) {
                System.out.println(cat);
            }
        }

        // кот с самым большим весом и возрастом одновременно
        Cat heaviestAndOldestCat = null;
        for (Cat cat : cats.values()) {
            if (heaviestAndOldestCat == null ||
                    (cat.weight > heaviestAndOldestCat.weight && cat.age > heaviestAndOldestCat.age)) {
                heaviestAndOldestCat = cat;
            }
        }
        System.out.println("Cat with the largest weight and age simultaneously: " + heaviestAndOldestCat);
    }
}
