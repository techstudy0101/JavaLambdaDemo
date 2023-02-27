package org.example.ch6;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class C1PrimitivePredicate {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            simplePredicate();
            primitivePredicate();
        }
    }

    public static void simplePredicate() {
        long start = System.nanoTime();
        Predicate<Integer> greaterThan10 = (x) -> x > 10;

        for (int i = 0; i < 100; i++) {
            greaterThan10.test(i);
        }
        long end = System.nanoTime();
        System.out.println("simplePredicate time = " + (end - start));
    }

    public static void primitivePredicate() {
        long start = System.nanoTime();
        IntPredicate greaterThan10 = (x) -> x > 10;

        for (int i = 0; i < 100; i++) {
            greaterThan10.test(i);
        }
        long end = System.nanoTime();
        System.out.println("primitivePredicate time = " + (end - start));
    }

}
