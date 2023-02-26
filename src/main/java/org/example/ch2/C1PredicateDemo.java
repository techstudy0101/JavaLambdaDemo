package org.example.ch2;

import java.util.function.Predicate;

public class C1PredicateDemo {

    // Predicate is the filter
    public static void main(String[] args) {
        predicateStart();
    }

    public static void predicateStart() {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s != null;
            }
        };
        System.out.println(predicate.test("TechStudy"));
        System.out.println(predicate.test(""));
        System.out.println(predicate.test(null));
    }
}
