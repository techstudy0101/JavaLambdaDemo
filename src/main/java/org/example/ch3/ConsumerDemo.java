package org.example.ch3;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        consumerStart();

        consumerExample();

        consumerCombinationExample();
    }

    public static void consumerStart(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer output = " + s);
            }
        };

        consumer.accept("Test");
    }

    public static void consumerExample(){
        Consumer<String> printMessage = (s) -> System.out.println(s);
        printMessage.accept("Consumer Example");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);

        numbers.forEach(numberPrinter);
    }

    public static void consumerCombinationExample(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);
        Consumer<Integer> square = (numb) -> System.out.println(numb * numb);

        Consumer<Integer> resultPrinter = square.andThen(numberPrinter);
        numbers.forEach(resultPrinter);
    }


}
