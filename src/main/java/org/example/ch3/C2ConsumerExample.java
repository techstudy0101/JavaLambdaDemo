package org.example.ch3;

import java.util.List;
import java.util.function.Consumer;

public class C2ConsumerExample {

    public static void main(String[] args) {
        consumerExample();
    }

    public static void consumerExample() {
        Consumer<String> printMessage = (s) -> System.out.println(s);
        printMessage.accept("Consumer Example");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);

        numbers.forEach(x -> numberPrinter.accept(x));

        numbers.forEach(numberPrinter);
    }

}
