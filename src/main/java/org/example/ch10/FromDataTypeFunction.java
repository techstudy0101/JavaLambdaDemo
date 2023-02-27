package org.example.ch10;

import java.util.function.*;

public class FromDataTypeFunction {

    public static void main(String[] args) {
        intFunction();
        longFunction();
        doubleFunction();
    }

    public static void intFunction(){
        IntFunction<String> intFunction = (x) -> String.valueOf(x);
        String result = intFunction.apply(5);
        System.out.println("fromIntFunction result = " + result);
    }

    public static void longFunction(){
        LongFunction<String> longFunction = (x) -> String.valueOf(x);
        String result = longFunction.apply(5);
        System.out.println("longFunction result = " + result);
    }

    public static void doubleFunction(){
        DoubleFunction<String> doubleFunction = (x) -> String.valueOf(x);
        String result = doubleFunction.apply(5.0);
        System.out.println("doubleFunction result = " + result);
    }

}
