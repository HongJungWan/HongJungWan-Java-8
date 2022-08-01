package me.whiteship.before;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

    public static void main(String[] args) {

        // Static Method 참조
        Supplier<String> supplier = Hello::printJava; // () -> Hello.printJava();
        System.out.println(supplier.get()); // [결과]: Hello, Java!!


        // 특정 객체의 Instance Method 참조
        Hello hello = new Hello();
        Function<String, String> function = hello::print; // s -> hello.print(s);
        System.out.println(function.apply("Java!")); // [결과]: Hello, Java!


        // Constructor 참조
        Function<String, Hello> newHello = Hello::new; // s -> new Hello(s);
        System.out.println(newHello.apply("Java").printName()); // [결과]: Hello, Java


        // 임의 객체의 Instance Method 참조
        String[] names = {"a", "c", "b"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names)); // [결과]: [a, b, c]

    }
}
