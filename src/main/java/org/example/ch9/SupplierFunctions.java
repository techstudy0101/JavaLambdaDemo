package org.example.ch9;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SupplierFunctions {
    public static void main(String[] args) {
        intSupplier();
        longSupplier();
        doubleSupplier();
        booleanSupplier();
    }

    public static void intSupplier() {
        IntSupplier intSupplier = () -> 5;
        int result = intSupplier.getAsInt();
        System.out.println("intSupplier result = " + result);
    }

    public static void longSupplier() {
        LongSupplier longSupplier = () -> 5L;
        long result = longSupplier.getAsLong();
        System.out.println("longSupplier result = " + result);
    }

    public static void doubleSupplier() {
        DoubleSupplier doubleSupplier = () -> 5.0;
        double result = doubleSupplier.getAsDouble();
        System.out.println("doubleSupplier result = " + result);
    }

    public static void booleanSupplier() {
        BooleanSupplier booleanSupplier = () -> false;
        boolean result = booleanSupplier.getAsBoolean();
        System.out.println("booleanSupplier result = " + result);
    }
}
