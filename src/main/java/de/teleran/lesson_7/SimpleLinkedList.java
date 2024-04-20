package de.teleran.lesson_7;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

public class SimpleLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();


        //dobavlenie v konec
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);

        list.addLast(7);

        System.out.println(list);

        //vstavit` element
        list.add(2,18);

        System.out.println(list);


        //vstavit` v nachalo
        list.addFirst(11); //ravnoznachnii s add
        list.add(0,13);

        System.out.println(list);


        //-Udalenie s golovi

        System.out.println(list.remove(0)); // udalenie po indexsy
        System.out.println(list);

        System.out.println(list.removeFirst()); // alternativnii metod
        System.out.println(list);

        // Udalenie s xvosta

        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println(list.remove(list.size()-1));
        System.out.println(list);

        //udalenie s seredini

        System.out.println(list.remove(2)); //udalenie po indexsy
        System.out.println(list);

        //universal`noe udalenie - po znacheniu
        System.out.println(list.remove(Integer.valueOf(8))); //tol`ko dlya Integer
        System.out.println(list);

        //izvlechenie informacii
        System.out.println(list.get(1));
        System.out.println(list.getFirst());// s 21 versii
        System.out.println(list.getLast());// s 21 versii


        //Dopolnitelnii metod

        //poisk informacii
        System.out.println(list.contains(10)); // falce
        System.out.println(list.contains(5)); // true

        //Izmenenie informacii
        System.out.println(list.set(1, 33));
        System.out.println(list);




    }
}
