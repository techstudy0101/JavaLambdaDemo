package org.example.ch7;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateFunctions {

    public static void main(String[] args) {
        intPredicate();
        longPredicate();
        doublePredicate();
        biPredicate();
    }

    public static void intPredicate() {
        IntPredicate intPredicate = (x) -> x > 5;
        boolean result = intPredicate.test(10);
        System.out.println("intPredicate result = " + result);
    }

    public static void longPredicate() {
        LongPredicate longPredicate = (x) -> x > 5;
        boolean result = longPredicate.test(10);
        System.out.println("longPredicate result = " + result);
    }

    public static void doublePredicate() {
        DoublePredicate doublePredicate = (x) -> x > 5;
        boolean result = doublePredicate.test(10);
        System.out.println("doublePredicate result = " + result);
    }

    public static void biPredicate() {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        boolean result = biPredicate.test(10, 15);
        System.out.println("biPredicate result = " + result);
    }

}
