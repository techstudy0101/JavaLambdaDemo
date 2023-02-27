package org.example.ch12;

import java.util.function.*;

public class BinaryOperatorFunction {

    public static void main(String[] args) {
        binaryOperatorExample();
        intBinaryOperator();
        longBinaryOperator();
        doubleBinaryOperator();
    }

    public static void binaryOperatorExample(){
        BinaryOperator<Integer> sumOperator = (x, y) -> x + y;
        Integer result = sumOperator.apply(5, 10);
        System.out.println("result = " + result);
    }

    public static void intBinaryOperator(){
        IntBinaryOperator sumOperator = (x, y) -> x + y;
        int result = sumOperator.applyAsInt(5, 10);
        System.out.println("intBinaryOperator result = " + result);
    }

    public static void longBinaryOperator(){
        LongBinaryOperator sumOperator = (x, y) -> x + y;
        long result = sumOperator.applyAsLong(5, 10);
        System.out.println("longBinaryOperator result = " + result);
    }

    public static void doubleBinaryOperator(){
        DoubleBinaryOperator sumOperator = (x, y) -> x + y;
        double result = sumOperator.applyAsDouble(5, 10);
        System.out.println("doubleBinaryOperator result = " + result);
    }

}
