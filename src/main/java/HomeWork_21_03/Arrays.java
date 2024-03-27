package HomeWork_21_03;

//Посчитайте сумму элементов одномерного массива:

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void toString(int[] array) {
        return ;
    }
}
