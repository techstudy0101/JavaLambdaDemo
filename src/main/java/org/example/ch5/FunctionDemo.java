package org.example.ch5;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        functionStart();

        functionExample();

        functionCombinationExample();

        functionIdentityExample();

        biFunctionExample();
    }

    private static void functionStart() {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        int length = function.apply("TechStudy");
        System.out.println("length of TechStudy = " + length);
    }

    private static void functionExample() {
        Function<String, Integer> function = (s) -> s.length();

        int length = function.apply("TechStudy");
        System.out.println("length of TechStudy = " + length);

        Function<Integer, Boolean> positiveFunction = (numb) -> numb > -1;
        System.out.println("positiveFunction for 4 = " + positiveFunction.apply(4));
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

    public static void biFunctionExample(){
        BiFunction<Integer, Integer, Integer> addFunc = (x, y) -> x + y;

        int result = addFunc.apply(10, 5);
        System.out.println("result = " + result);
    }

}
