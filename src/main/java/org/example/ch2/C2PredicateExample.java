package org.example.ch2;

import java.util.function.Predicate;

public class C2PredicateExample {

    public static void main(String[] args) {
        predicateExample();
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

}
