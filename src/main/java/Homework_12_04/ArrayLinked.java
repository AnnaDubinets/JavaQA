package Homework_12_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        LinkedList<Integer> linkedList = new LinkedList<>();
           //в конец
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long arrayListAddEndTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long linkedListAddEndTime = System.nanoTime() - startTime;

        // в начало
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        long arrayListAddFirstTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.addFirst(i);
        }
        long linkedListAddFirstTime = System.nanoTime() - startTime;

        // в середину
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long arrayListAddMiddleTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long linkedListAddMiddleTime = System.nanoTime() - startTime;


        // результаты
        System.out.println("ArrayList add time: " + arrayListAddEndTime);
        System.out.println("LinkedList add time: " + linkedListAddEndTime);
        System.out.println("ArrayList addFirst time: " + arrayListAddFirstTime);
        System.out.println("LinkedList addFirst time: " + linkedListAddFirstTime);
        System.out.println("ArrayList addMiddle time: " + arrayListAddMiddleTime);
        System.out.println("LinkedList addMiddle time: " + linkedListAddMiddleTime);

    }


}

