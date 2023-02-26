package org.example.ch1;

public class LambdaExample {

    @FunctionalInterface
    interface Work {
        int execute();
    }

    public static void main(String[] args) {
        implementingInterface();
        anonymousClass();
        lambda();
        lambdaWithCurly();
    }

    static class SoftwareWork implements Work {

        @Override
        public int execute() {
            return 5;
        }
    }

    public static void implementingInterface(){
        SoftwareWork softwareWork = new SoftwareWork();
        int result = softwareWork.execute();
        System.out.println("implementingInterface result = " + result);
    }

    public static void anonymousClass(){
        Work softwareWork = new Work() {
            @Override
            public int execute() {
                return 5;
            }
        };
        int result = softwareWork.execute();
        System.out.println("anonymousClass result = " + result);
    }

    public static void lambda(){
        Work work = () -> 5;
        int result = work.execute();
        System.out.println("lambda result = " + result);
    }

    public static void lambdaWithCurly(){
        Work work = () -> {
            return 5;
        };
        int result = work.execute();
        System.out.println("lambdaWithCurly result = " + result);
    }

}
