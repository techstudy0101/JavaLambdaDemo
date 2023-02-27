package org.example.ch12;

import java.util.function.*;

public class OperatorFunction {

    public static void main(String[] args) {
        unaryOperatorExample();
        intUnaryOperator();
        longUnaryOperator();
        doubleUnaryOperator();
    }

    public static void unaryOperatorExample(){
        UnaryOperator<Integer> squareOperator = (x) -> x * x;
        Integer result = squareOperator.apply(5);
        System.out.println("result = " + result);
    }

    public static void intUnaryOperator(){
        IntUnaryOperator squareOperator = (x) -> x * x;
        int result = squareOperator.applyAsInt(5);
        System.out.println("intUnaryOperator result = " + result);
    }

    public static void longUnaryOperator(){
        LongUnaryOperator squareOperator = (x) -> x * x;
        long result = squareOperator.applyAsLong(5);
        System.out.println("longUnaryOperator result = " + result);
    }

    public static void doubleUnaryOperator(){
        DoubleUnaryOperator squareOperator = (x) -> x * x;
        double result = squareOperator.applyAsDouble(5);
        System.out.println("doubleUnaryOperator result = " + result);
    }

}
