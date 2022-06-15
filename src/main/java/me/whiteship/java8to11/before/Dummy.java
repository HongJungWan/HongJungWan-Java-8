package me.whiteship.java8to11.before;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grape");
        fruits.add("melon");

        fruits.stream() // 소스 스트림
                .filter(s -> s.startsWith("b"))
                .forEach(System.out::println);

        /* 결과 값
         *
         * banana
         * */
    }
}


