package HomeWork_27_03;

import java.util.ArrayList;

public class HumanMain {
    public static void main(String[] args) {
        // Создаем ArrayList с объектами Human
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Alice", 30));
        humans.add(new Human("Bob", 25));
        humans.add(new Human("Charlie", 35));

        // Выводим объекты на экран
        System.out.println("Все объекты:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // Выводим только объекты, удовлетворяющие определенному условию
        System.out.println("\nОбъекты старше 30 лет:");
        for (Human human : humans) {
            if (human.getAge() > 30) {
                System.out.println(human);
            }
        }

        // Удаляем объекты, удовлетворяющие определенному условию
        humans.removeIf(human -> human.getAge() < 30);
        System.out.println("\nArrayList после удаления объектов младше 30 лет:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // Отфильтровываем только уникальные элементы
        ArrayList<Human> uniqueHumans = new ArrayList<>();
        for (Human human : humans) {
            if (!uniqueHumans.contains(human)) {
                uniqueHumans.add(human);
            }
        }
        System.out.println("\nУникальные объекты:");
        for (Human human : uniqueHumans) {
            System.out.println(human);
        }
    }
}
