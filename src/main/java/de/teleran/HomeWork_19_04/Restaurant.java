package de.teleran.HomeWork_19_04;

import java.util.LinkedHashSet;
import java.util.Set;

public class Restaurant {
        private Set<Order> orders;

        public Restaurant() {
            orders = new LinkedHashSet<>();
        }

        public void addOrder(Order order) {
            orders.add(order);
        }

        public void processOrders() {
            for (Order order : orders) {
                System.out.println("Preparing dish: " + order.getDish());

            }
            orders.clear();
        }

        public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();
            restaurant.addOrder(new Order("Pasta"));
            restaurant.addOrder(new Order("Salad"));
            restaurant.addOrder(new Order("Steak"));

            restaurant.processOrders();
        }
    }
