package org.example.ch4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args) {
        supplierStart();

        supplierExample();

        supplierCombinationExample();
    }

    public static void supplierStart(){
        Supplier<String> supplier = new Supplier<String>(){

            @Override
            public String get() {
                return "Supplier Example";
            }
        };
        System.out.println("supplier output = " + supplier.get());
    }

    public static void supplierExample(){
        Supplier<String> getMessage = () -> "Default Value of x = 5";
        System.out.println(getMessage.get());

        Supplier<List<Integer>> getNumbers = () -> List.of(1, 2, 3, 4, 5);
        Consumer<Integer> numberPrinter = (numb) -> System.out.println(numb);

        getNumbers.get().forEach(numberPrinter);
    }

    public static void supplierCombinationExample(){
        // No Supplier combination method
    }


}
