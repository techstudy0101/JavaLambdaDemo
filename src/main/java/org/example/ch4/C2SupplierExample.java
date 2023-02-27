package org.example.ch4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class C2SupplierExample {
    public static void main(String[] args) {
        supplierExample();
    }

    public static void supplierExample() {
        Supplier<String> getMessage = () -> "Default Value of x = 5";
        System.out.println(getMessage.get());

        Supplier<List<Integer>> getNumbers = () -> List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);

        getNumbers.get().forEach(numberPrinter);
    }

}
