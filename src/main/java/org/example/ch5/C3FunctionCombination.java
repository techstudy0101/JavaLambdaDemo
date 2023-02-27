package org.example.ch5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class C3FunctionCombination {

    public static void main(String[] args) {
        functionCombinationExample();

        functionIdentityExample();

        biFunctionExample();
    }

    private static void functionCombinationExample() {
        Function<Integer, Integer> squareFunc = (numb) -> numb * numb;
        Function<Integer, Integer> addConst5 = (numb) -> numb + 5;

        Function<Integer, Integer> resultOfThen = squareFunc.andThen(addConst5);
        Function<Integer, Integer> resultOfCompose = squareFunc.compose(addConst5);

        Integer resultOfThanValue = resultOfThen.apply(5);
        Integer resultOfComposeValue = resultOfCompose.apply(5);

        System.out.println("resultOfThanValue = " + resultOfThanValue);
        System.out.println("resultOfComposeValue = " + resultOfComposeValue);
    }

    private static void functionIdentityExample() {
        System.out.println("--- functionIdentityExample ---");
        Function<Integer, Integer> identity = Function.identity();
        System.out.println("identity result = " + identity.apply(6));
    }

    public static void biFunctionExample() {
        BiFunction<Integer, Integer, Integer> addFunc = (x, y) -> x + y;

        int result = addFunc.apply(10, 5);
        System.out.println("result = " + result);
    }
}
