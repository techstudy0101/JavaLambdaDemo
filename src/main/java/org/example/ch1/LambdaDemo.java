package org.example.ch1;

import java.util.concurrent.Callable;

public class LambdaDemo {

    // 1. Anonymous Function in Java
    // 2. Replacement of Anonymous class
    // 3. Available from java SE 8.
    // 4. Only Function interface can be converted into Lambda Function
    // 5. Syntax: () -> {};

    // Why Lambda?
    // Better code readability
    // We need to define only behaviour
    // Functional coding style

    public static void main(String[] args) throws Exception {
        implementingInterface();
        anonymousClass();
        lambda();
        lambdaWithReturn();
    }

    static class MyExecutor implements Runnable {
        @Override
        public void run() {
            System.out.println("Implementing Interface: Runnable Executed");
        }
    }

    public static void implementingInterface(){
        MyExecutor myExecutor = new MyExecutor();
        myExecutor.run();
    }

    public static void anonymousClass(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class: Runnable Executed");
            }
        };
        runnable.run();
    }

    public static void lambda(){
        Runnable runnable = () -> System.out.println("Lambda: Runnable Executed");
        runnable.run();

        Runnable runnableWithCurly = () -> {
            System.out.println("LambdaWithCurly: Runnable Executed");
        };
        runnableWithCurly.run();
    }

    public static void lambdaWithReturn() throws Exception {
        Callable<Integer> callable = () -> 5;
        callable.call();

        Callable<Integer> callableWithCurly = () -> {
            System.out.println("callableWithCurly");
            return 5;
        };
        callableWithCurly.call();
    }
}
