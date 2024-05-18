package HomeWork_17_05;

public class Main {
    public static void main(String[] args) {
        WareHouse warehouse = new WareHouse();
        warehouse.loadProduct("Brick1");
        warehouse.loadProduct("Brick2");
        warehouse.unloadProduct();
        warehouse.unloadProduct();
        warehouse.unloadProduct(); // Попытка отгрузить при пустом складе
    }
}
