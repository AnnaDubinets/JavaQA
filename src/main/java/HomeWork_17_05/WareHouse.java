package HomeWork_17_05;

import java.util.Stack;

public class WareHouse {
    private Stack<String> warehouse;

    public WareHouse() {
        this.warehouse = new Stack<>();
    }

    // Загрузка товара
    public void loadProduct(String product) {
        warehouse.push(product);
        System.out.println("Loaded: " + product);
    }

    // Отгрузка товара
    public void unloadProduct() {
        if (!warehouse.isEmpty()) {
            String product = warehouse.pop();
            System.out.println("Unloaded: " + product);
        } else {
            System.out.println("No products to unload.");
        }
    }
}
