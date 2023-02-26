package org.example.ch3;

import java.util.function.Consumer;

public class C1ConsumerDemo {

    public static void main(String[] args) {
        consumerStart();
    }

    public static void consumerStart() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer output = " + s);
            }
        };

        consumer.accept("Test");
    }

}
