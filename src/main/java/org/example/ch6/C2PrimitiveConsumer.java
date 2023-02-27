package org.example.ch6;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class C2PrimitiveConsumer {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            primitiveConsumer();
            normalConsumer();
        }
    }

    public static void normalConsumer(){
        long start = System.nanoTime();
        Consumer<Integer> pincodeConsumer = (x) -> {

        };

        for(int i = 0; i < 100; i++){
            pincodeConsumer.accept(i);
        }

        long end = System.nanoTime();
        System.out.println("normalConsumer time = " + (end - start));
    }

    public static void primitiveConsumer(){
        long start = System.nanoTime();
        IntConsumer pincodeConsumer = (x) -> {

        };

        for(int i = 0; i < 100; i++){
            pincodeConsumer.accept(i);
        }

        long end = System.nanoTime();
        System.out.println("primitiveConsumer time = " + (end - start));
    }

}
