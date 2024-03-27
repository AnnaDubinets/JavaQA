package HomeWork_21_03;


//Посчитайте произведение положительных элементов одномерного массива:
public class Arrays_3 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5};
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                product *= array[i];
            }
        }
        System.out.println("Произведение положительных элементов массива: " + product);
    }
}
