package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

        // Function<T,R>
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        plus10.andThen(multiply2).apply(2); // (10 + 2) * 2 = 24
        plus10.compose(multiply2).apply(2); // (2 * 2) + 10 = 14


        // BiFunction<T,U,R>
        BiFunction<Integer, Integer, Integer> addTwoInt = (a, b) -> a + b;

        int res = addTwoInt.apply(10,15);

        System.out.println(res);


        // Consumer<T>
        Consumer<Integer> printInt = input -> System.out.println(input);


        // Supplier<T>
        Supplier<Integer> get20 = () -> 20;

        int res2 = get20.get();

        System.out.println(res2);


        // Predicate<T>
        Predicate<String> startWithHong = str -> str.startsWith("Hong");

        boolean res3 = startWithHong.test("HongJungWan");

        System.out.println(res3);


        // UnaryOperator<T>
        UnaryOperator<Integer> plus30U = input -> input + 30;

        int res4 = plus30U.apply(30);

        System.out.println(res4);


        // BinaryOperator<T>
        BinaryOperator<Integer> addTwoIntB0 = (a, b) -> a + b;

        int res5 = addTwoIntB0.apply(20, 80);

        System.out.println(res5);

    }

}
