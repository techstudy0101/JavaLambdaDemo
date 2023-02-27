package org.example.ch5;


import java.util.function.Function;

public class C1FunctionDemo {

    public static void main(String[] args) {
        functionStart();
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
}
