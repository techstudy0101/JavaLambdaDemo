package org.example.ch3;

import java.util.List;
import java.util.function.Consumer;

public class C3ConsumerCombinationExample {

    public static void main(String[] args) {
        consumerCombinationExample();
    }

    public static void consumerCombinationExample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);
        Consumer<Integer> square = (numb) -> System.out.println(numb * numb);

        Consumer<Integer> resultPrinter = square.andThen(numberPrinter);
        numbers.forEach(resultPrinter);
    }

}
