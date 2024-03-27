package de.teleran.lesson_5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arrInt;
        arrInt = new int[10];
        System.out.println(Arrays.toString(arrInt));
        arrInt[0] = 5;
        arrInt[5] = 10;
        System.out.println(Arrays.toString(arrInt));

        int[] arrIntLit = {1, 5, 7, 3, 9, 4, 8};
        System.out.println(Arrays.toString(arrIntLit));

        int result = arrIntLit[3];
        System.out.println("arrIntLit[3] = " + result);
        System.out.println(arrIntLit[6]);

        arrIntLit[2] = 11;
        System.out.println(Arrays.toString(arrIntLit));
        System.out.println(Arrays.toString(arrIntLit));

        int[] arrIntLitClone = arrIntLit.clone();
        arrIntLitClone[2] = 33;
        System.out.println(Arrays.toString(arrIntLitClone));
        System.out.println(Arrays.toString(arrIntLit));
    }
}
