package HomeWork_24_05;

import java.awt.print.Printable;
import java.util.function.Consumer;


    //1. Создание функционального интерфейса Printable:

    //@FunctionalInterface
   // interface Printable {
        //void print(String text);
    //}




    //3.Замена интерфейса стандартным функциональным интерфейсом:

public class _1 {
    public static void main(String[] args) {
        Consumer<String> upperCasePrinter = (text) -> System.out.println(text.toUpperCase());
        Consumer<String> lowerCasePrinter = (text) -> System.out.println(text.toLowerCase());

        upperCasePrinter.accept("Hello, World!");
        lowerCasePrinter.accept("Hello, World!");
    }
}


