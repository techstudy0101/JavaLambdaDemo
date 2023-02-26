package org.example.ch2;

import java.util.function.Predicate;

public class PredicateDemo {

    // Predicate is the filter

    public static void main(String[] args) {
        predicateStart();

        predicateExample();

        predicateCombinationExample();

    }

    public static void predicateStart(){
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
        System.out.println(predicate.test("TechStudy"));
    }

    private static void predicateExample() {
        System.out.println("--- predicateExample ---");
        Predicate<String> isNotNull = (s) -> s != null;

        boolean resultNotNull = isNotNull.test("TechStudy");
        boolean resultNull = isNotNull.test(null);
        boolean resultEmpty = isNotNull.test("");
        System.out.println("result of TechStudy = " + resultNotNull);
        System.out.println("resultNull of null = " + resultNull);
        System.out.println("resultEmpty of empty = " + resultEmpty);
        System.out.println("--- predicateExample ---");
    }

    private static void predicateCombinationExample() {
        System.out.println("--- predicateCombinationExample ---");
        Predicate<String> isNotNull = (s) -> s != null;
        Predicate<String> isNotEmpty = (s) -> !s.isEmpty();
        Predicate<String> isNotBlank = isNotNull.and(isNotEmpty);


        boolean resultNotNull = isNotBlank.test("TechStudy");
        boolean resultNull = isNotBlank.test(null);
        boolean resultEmpty = isNotBlank.test("");
        System.out.println("result of TechStudy = " + resultNotNull);
        System.out.println("resultNull of null = " + resultNull);
        System.out.println("resultEmpty of empty = " + resultEmpty);
        System.out.println("--- predicateCombinationExample ---");
    }


}
