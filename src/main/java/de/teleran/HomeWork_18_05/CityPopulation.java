package de.teleran.HomeWork_18_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityPopulation {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("Berlin", 3500000);
        cityPopulation.put("London", 8900000);
        cityPopulation.put("Tokyo", 13900000);
        cityPopulation.put("Seoul", 9776000);
        cityPopulation.put("Mumbai", 20400000);

        // находим город с самым большим количеством жителей ж-й
        String largestCity = null;
        int maxPopulation = 0;
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                largestCity = entry.getKey();
            }
        }
        System.out.println("City with the largest population: " + largestCity + " with " + maxPopulation + " residents.");

        // находим среднее количество жителей по всем городам
        int totalPopulation = 0;
        for (int population : cityPopulation.values()) {
            totalPopulation += population;
        }
        double averagePopulation = totalPopulation / (double) cityPopulation.size();
        System.out.println("Average population: " + averagePopulation);

        // находим все города, у которых количество жителей одинаковое
        Map<Integer, List<String>> populationGroups = new HashMap<>();
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            populationGroups.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println("Cities with the same population:");
        for (Map.Entry<Integer, List<String>> entry : populationGroups.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println(entry.getValue() + " have " + entry.getKey() + " residents.");
            }
        }
    }
}
