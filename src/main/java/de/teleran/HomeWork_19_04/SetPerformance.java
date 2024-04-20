package de.teleran.HomeWork_19_04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPerformance {
    public static void main(String[] args) {
        int N = 1000000;

        // HashSet
        long startTime = System.currentTimeMillis();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(i);
        }
        long addTimeHashSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            hashSet.contains(i);
        }
        long containsTimeHashSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            hashSet.remove(i);
        }
        long removeTimeHashSet = System.currentTimeMillis() - startTime;

        // TreeSet
        startTime = System.currentTimeMillis();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            treeSet.add(i);
        }
        long addTimeTreeSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            treeSet.contains(i);
        }
        long containsTimeTreeSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            treeSet.remove(i);
        }
        long removeTimeTreeSet = System.currentTimeMillis() - startTime;

        // LinkedHashSet
        startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            linkedHashSet.add(i);
        }
        long addTimeLinkedHashSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedHashSet.contains(i);
        }
        long containsTimeLinkedHashSet = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedHashSet.remove(i);
        }
        long removeTimeLinkedHashSet = System.currentTimeMillis() - startTime;


        System.out.println("HashSet: Add Time = " + addTimeHashSet + " ms, Contains Time = " + containsTimeHashSet + " ms, Remove Time = " + removeTimeHashSet + " ms");
        System.out.println("TreeSet: Add Time = " + addTimeTreeSet + " ms, Contains Time = " + containsTimeTreeSet + " ms, Remove Time = " + removeTimeTreeSet + " ms");
        System.out.println("LinkedHashSet: Add Time = " + addTimeLinkedHashSet + " ms, Contains Time = " + containsTimeLinkedHashSet + " ms, Remove Time = " + removeTimeLinkedHashSet + " ms");
    }
}
