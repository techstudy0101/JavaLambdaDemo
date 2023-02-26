package org.example.ch1;

public class LambdaExample {

    @FunctionalInterface
    interface Work {
        int execute(String taskName);
    }

    public static void main(String[] args) {
        implementingInterface();
        anonymousClass();
        lambda();
        lambdaWithCurly();
    }

    static class SoftwareWork implements Work {

        @Override
        public int execute(String taskName) {
            return 5;
        }
    }

    public static void implementingInterface(){
        SoftwareWork softwareWork = new SoftwareWork();
        int result = softwareWork.execute("Install Operating System");
        System.out.println("implementingInterface result = " + result);
    }

    public static void anonymousClass(){
        Work softwareWork = new Work() {
            @Override
            public int execute(String taskName) {
                return 5;
            }
        };
        int result = softwareWork.execute("Install Operating System");
        System.out.println("anonymousClass result = " + result);
    }

    public static void lambda(){
        Work work = (String taskName) -> 5;
        int result = work.execute("Install Operating System");
        System.out.println("lambda result = " + result);
    }

    public static void lambdaWithCurly(){
        Work work = (String taskName) -> {
            return 5;
        };
        int result = work.execute("Install Operating System");
        System.out.println("lambdaWithCurly result = " + result);
    }

}
