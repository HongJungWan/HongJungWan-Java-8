package me.whiteship.java8to11.annotation;

import java.util.Arrays;

@Chicken("양념")
@Chicken("마늘")
@Chicken("간장")
@Chicken("후라이드")
public class AppForJava8Annotation {

    public static void main(String[] args) {
        Chicken[] chickens = AppForJava8Annotation.class.getAnnotationsByType(Chicken.class);

        Arrays.stream(chickens).forEach(c -> {
            System.out.println(c.value());
        });

        System.out.println(" ");

        ChickenContainer chickenContainer = AppForJava8Annotation.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(c -> {
            System.out.println(c.value());
        });
    }
}
