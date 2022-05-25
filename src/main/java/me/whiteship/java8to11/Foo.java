package me.whiteship.java8to11;

public class Foo {

    // 자바 8 이전
    public static void main(String[] args) {
        
        // 익명 내부 클래스 (anonymous inner class)
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {

            }
        };
    }

}
