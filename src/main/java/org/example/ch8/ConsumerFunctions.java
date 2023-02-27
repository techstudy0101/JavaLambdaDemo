package org.example.ch8;

import java.util.function.*;

public class ConsumerFunctions {

    public static void main(String[] args) {

        intConsumer();
        longConsumer();
        doubleConsumer();
        biConsumer();
        biObjIntConsumer();
        biObjLongConsumer();
        biObjDoubleConsumer();

    }

    public static void intConsumer() {
        IntConsumer intConsumer = (x) -> System.out.println("intConsumer result = " + x);
        intConsumer.accept(5);
    }

    public static void longConsumer() {
        LongConsumer longConsumer = (x) -> System.out.println("longConsumer result = " + x);
        longConsumer.accept(5L);
    }

    public static void doubleConsumer() {
        DoubleConsumer doubleConsumer = (x) -> System.out.println("doubleConsumer result = " + x);
        doubleConsumer.accept(5.0);
    }

    public static void biConsumer() {
        BiConsumer<Integer, Integer> additionConsumer = (x, y) -> System.out.println("biConsumer result = " + (x + y));
        additionConsumer.accept(5, 15);
    }

    public static void biObjIntConsumer() {
        ObjIntConsumer<String> objIntConsumer = (x, y) -> System.out.println("biObjIntConsumer result = " + (x + y));
        objIntConsumer.accept("V", 15);
    }

    public static void biObjLongConsumer() {
        ObjLongConsumer<String> objLongConsumer = (x, y) -> System.out.println("biObjLongConsumer result = " + (x + y));
        objLongConsumer.accept("V", 15L);
    }

    public static void biObjDoubleConsumer() {
        ObjDoubleConsumer<String> objDoubleConsumer = (x, y) -> System.out.println("biObjDoubleConsumer result = " + (x + y));
        objDoubleConsumer.accept("V", 15.0);
    }

}
