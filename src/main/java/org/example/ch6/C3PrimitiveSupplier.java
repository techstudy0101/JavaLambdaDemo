package org.example.ch6;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class C3PrimitiveSupplier {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            simpleSupplier();
            primitiveSupplier();
        }
    }

    public static void simpleSupplier() {
        long start = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int finalI = i;
            Supplier<Integer> supplier = () -> finalI;
            int val = supplier.get();
        }
        long end = System.nanoTime();
        System.out.println("simpleSupplier time = " + (end - start));
    }

    public static void primitiveSupplier() {
        long start = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int finalI = i;
            IntSupplier intSupplier = () -> finalI;
            int val = intSupplier.getAsInt();
        }
        long end = System.nanoTime();
        System.out.println("primitiveSupplier time = " + (end - start));
    }

}
