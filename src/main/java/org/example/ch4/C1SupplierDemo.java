package org.example.ch4;

import java.util.function.Supplier;

public class C1SupplierDemo {


    public static void main(String[] args) {
        supplierStart();
    }

    public static void supplierStart() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Supplier Example";
            }
        };

        System.out.println("supplier output = " + supplier.get());
    }
}
