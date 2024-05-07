package de.teleran.HW_07_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSimulation {
    public static void main(String[] args) {
        List<Animal> population = new ArrayList<>();
        int initialPopulation = 10000000;
        double birthRatePer1000 = 14.0;
        double deathRatePer1000 = 8.0;
        int years = 10;

        //начальная популяции зверей
        for (int i = 0; i < initialPopulation; i++) {
            population.add(new Animal());
        }

        //изменения популяции
        for (int year = 0; year < years; year++) {
            Iterator<Animal> iterator = population.iterator();
            while (iterator.hasNext()) {
                Animal animal = iterator.next();

                if (Math.random() * 1000 < deathRatePer1000) {
                    iterator.remove();
                }
            }
            //рождаемость
            int births = (int) (population.size() * birthRatePer1000 / 1000);
            for (int i = 0; i < births; i++) {
                population.add(new Animal());
            }
        }

        System.out.println("Количество зверей через " + years + " лет: " + population.size());
    }

    static class Animal {

    }
}
