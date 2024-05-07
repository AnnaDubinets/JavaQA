package de.teleran.HW_07_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HW_07_05 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        // for-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for-each loop: " + (endTime - startTime));

        // classic for with list.size()
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for with list.size(): " + (endTime - startTime));

        // classic for with pre-calculated size
        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for with pre-calculated size: " + (endTime - startTime));

        // classic for iterating from end to start
        startTime = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("classic for iterating from end to start: " + (endTime - startTime));

        // Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime - startTime));

        // ListIterator from start to end
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator from start to end: " + (endTime - startTime));

        // ListIterator from end to start
        startTime = System.currentTimeMillis();
        listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int temp = listIterator.previous();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator from end to start: " + (endTime - startTime));
    }
}
