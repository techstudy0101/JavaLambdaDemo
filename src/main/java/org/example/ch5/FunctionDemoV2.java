package org.example.ch5;

import java.util.function.*;

public class FunctionDemoV2 {

    public static void main(String[] args) {
        unaryFunctionExample();

        toIntFunction();

        intToLongFunction();
    }

    public static void unaryFunctionExample(){
        UnaryOperator<Integer> square = (numb) -> numb * numb;
        System.out.println("square of 10 = " + square.apply(10));
    }

    public static void toIntFunction(){
        ToIntFunction<String> lengthInInt = (s) -> s.length();
        int length = lengthInInt.applyAsInt("TechStudy");
        System.out.println("lengthInInt of TechStudy = " + length);
    }

    public static void intToLongFunction(){
        IntToLongFunction intToLongFunction = (numb) -> numb * numb;
        long squareInLong = intToLongFunction.applyAsLong(10);
        System.out.println("squareInLong of 10 = " + squareInLong);
    }

}
