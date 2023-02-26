package org.example.ch5;

import java.util.function.Function;
import java.util.function.IntToLongFunction;

public class FunctionDemoAutoBoxing {


    public static void main(String[] args) {
        warmup();
        for (int i = 0; i < 100; i++) {
            simpleConversion("simpleConversion = ");
            optConversion("optConversion = ");
        }
    }

    private static void warmup() {
        simpleConversion("warmup simpleConversion = ");
        optConversion("warmup optConversion = ");
    }

    private static void simpleConversion(String prefix) {
        long start = System.nanoTime();
        Function<Integer, Long> conversionFromIntToLong = x -> x.longValue();
        for (int i = 0; i < 100; i++) {
            long len = conversionFromIntToLong.apply(i);
        }
        long end = System.nanoTime();
        System.out.println(prefix + (end - start));
    }

    private static void optConversion(String prefix) {
        long start = System.nanoTime();
        IntToLongFunction conversionFromIntToLong = x -> x;
        for (int i = 0; i < 100; i++) {
            long len = conversionFromIntToLong.applyAsLong(i);
        }
        long end = System.nanoTime();
        System.out.println(prefix + (end - start));
    }

}
