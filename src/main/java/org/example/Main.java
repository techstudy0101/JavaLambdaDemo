package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        predicateExample();
        consumerExample();
    }

    public static class DefaultSupplier implements Supplier<String> {

        @Override
        public String get() {
            return null;
        }
    }

    public static class DefaultSupplierV2 implements Supplier<String> {

        public DefaultSupplierV2(String val){

        }

        @Override
        public String get() {
            return null;
        }
    }

    public static void supplierExample(){

    }

    public static void consumerExample(){

        Predicate<User> userEmailCorrection = (user) -> user.getEmail().endsWith("gmail.com");
        Consumer<User> userEmail = user -> {
            if(!userEmailCorrection.test(user)){
                user.setEmail(user.getEmail().concat("gmail.com"));
            }
        };

        User user = new User();
        user.setId("1");
        user.setEmail("1");

        System.out.println("email = " + user.getEmail());
        userEmail.accept(user);
        System.out.println("email = " + user.getEmail());

    }

    static class User {
        private String id;
        private String name;
        private String email;

        private String address;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    private static void predicateExample() {
        Predicate<Integer> predicate = (i) -> i > 10;
        predicate.test(1);

        long start = System.nanoTime();
        for(int i = 1; i < 100; i++){
            predicate.test(i);
        }

        long end = System.nanoTime();
        System.out.println("diff1 = " + (end - start));

        start = System.nanoTime();
        for(int i = 1; i < 100; i++){
            Integer val = i;
            int k = val;
            if(k > 10){

            }
        }

        end = System.nanoTime();
        System.out.println("diff2 = " + (end - start));
    }
}