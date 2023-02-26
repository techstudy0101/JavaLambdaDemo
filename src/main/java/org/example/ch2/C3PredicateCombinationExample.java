package org.example.ch2;

import java.util.function.Predicate;

public class C3PredicateCombinationExample {

    public static void main(String[] args) {
        predicateCombinationExample();
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
