package org.example.ch11;

import java.util.function.*;

public class ConversionFunction {

    public static void main(String[] args) {
        intToLongFunction();
        intToDoubleFunction();
        longToIntFunction();
        longToDoubleFunction();
        doubleToIntFunction();
        doubleToLongFunction();
    }

    public static void intToLongFunction(){
        IntToLongFunction intToLongFunction = (x) -> x;
        long result = intToLongFunction.applyAsLong(5);
        System.out.println("intToLongFunction result = " + result);
    }

    public static void intToDoubleFunction(){
        IntToDoubleFunction intToDoubleFunction = (x) -> x;
        double result = intToDoubleFunction.applyAsDouble(5);
        System.out.println("intToDoubleFunction result = " + result);
    }

    public static void longToIntFunction(){
        LongToIntFunction longToIntFunction = (x) -> (int)x;
        int result = longToIntFunction.applyAsInt(5);
        System.out.println("longToIntFunction result = " + result);
    }

    public static void longToDoubleFunction(){
        LongToDoubleFunction longToDoubleFunction = (x) -> x;
        double result = longToDoubleFunction.applyAsDouble(5);
        System.out.println("longToDoubleFunction result = " + result);
    }

    public static void doubleToIntFunction(){
        DoubleToIntFunction doubleToIntFunction = (x) -> (int)x;
        int result = doubleToIntFunction.applyAsInt(5);
        System.out.println("doubleToIntFunction result = " + result);
    }

    public static void doubleToLongFunction(){
        DoubleToLongFunction doubleToLongFunction = (x) -> (long)x;
        long result = doubleToLongFunction.applyAsLong(5);
        System.out.println("doubleToLongFunction result = " + result);
    }

}
