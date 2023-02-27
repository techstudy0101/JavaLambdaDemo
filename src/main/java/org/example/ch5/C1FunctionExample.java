package org.example.ch5;

import java.util.function.Function;

public class C1FunctionExample {

    public static void main(String[] args) {
        functionExample();
    }

    private static void functionExample() {
        Function<String, Integer> function = (s) -> s.length();

        int length = function.apply("TechStudy");
        System.out.println("length of TechStudy = " + length);

        Function<Integer, Boolean> positiveFunction = (numb) -> numb > -1;
        System.out.println("positiveFunction for 4 = " + positiveFunction.apply(4));
    }

}
