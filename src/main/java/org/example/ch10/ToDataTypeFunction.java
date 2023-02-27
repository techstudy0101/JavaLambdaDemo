package org.example.ch10;

import java.util.function.*;

public class ToDataTypeFunction {

    public static void main(String[] args) {
        toIntFunction();
        toLongFunction();
        toDoubleFunction();

        toIntBiFunction();
        toLongBiFunction();
        toDoubleBiFunction();
    }

    public static void toIntFunction(){
        ToIntFunction<String> toIntFunction = (s) -> Integer.parseInt(s);
        int result = toIntFunction.applyAsInt("5");
        System.out.println("toIntFunction result = " + result);
    }

    public static void toLongFunction(){
        ToLongFunction<String> toLongFunction = (s) -> Long.parseLong(s);
        long result = toLongFunction.applyAsLong("5");
        System.out.println("toLongFunction result = " + result);
    }

    public static void toDoubleFunction(){
        ToDoubleFunction<String> toDoubleFunction = (s) -> Double.parseDouble(s);
        double result = toDoubleFunction.applyAsDouble("5.0");
        System.out.println("toDoubleFunction result = " + result);
    }

    public static void toIntBiFunction(){
        ToIntBiFunction<String, String> toIntFunction = (s1, s2) -> Integer.parseInt(s1 + s2);
        int result = toIntFunction.applyAsInt("5", "7");
        System.out.println("toIntBiFunction result = " + result);
    }

    public static void toLongBiFunction(){
        ToLongBiFunction<String, String> toLongFunction = (s1, s2) -> Long.parseLong(s1 + s2);
        long result = toLongFunction.applyAsLong("5", "5");
        System.out.println("toLongBiFunction result = " + result);
    }

    public static void toDoubleBiFunction(){
        ToDoubleBiFunction<String, String> toDoubleFunction = (s1, s2) -> Double.parseDouble(s1 + s2);
        double result = toDoubleFunction.applyAsDouble("5", "5");
        System.out.println("toDoubleBiFunction result = " + result);
    }

}
