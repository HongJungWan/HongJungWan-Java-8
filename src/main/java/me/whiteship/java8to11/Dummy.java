package me.whiteship.java8to11;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Dummy {

    public static void main(String[] args) {

        Dummy dummy = new Dummy();
        dummy.run();

    }

    private void run() {

        int baseNumber = 20;

        // 내부 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다 표현식
        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(20);
    }

}


