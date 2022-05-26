package me.whiteship.java8to11;

public class Foo {

    // 자바 8 이전
    public static void main(String[] args) {
        
        // 익명 내부 클래스 (anonymous inner class), 자바 8이전
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        RunSomething runSomething2 = () -> System.out.println("Hello");

        RunSomething runSomething3 = Foo::doIt;

        RunSomething runSomething4 = () -> {
            System.out.println("Hello");
            System.out.printf("Hong");
        };

        runSomething1.doIt();
        runSomething2.doIt();
        runSomething3.doIt();
        runSomething4.doIt();
    }

    private static void doIt() {
        System.out.println("Hello");
    }
}
