package de.teleran.HomeWork_18_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRoute {
    public static List<String> findItinerary(Map<String, String> tickets) {
        Map<String, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, String> entry : tickets.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        String start = null;
        for (String city : tickets.keySet()) {
            if (!reverseMap.containsKey(city)) {
                start = city;
                break;
            }
        }

        List<String> itinerary = new ArrayList<>();
        while (start != null) {
            itinerary.add(start);
            start = tickets.get(start);
        }

        return itinerary;
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Berlin", "London");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        List<String> itinerary = findItinerary(tickets);
        System.out.println("Route: " + String.join(" -> ", itinerary));
    }
}
