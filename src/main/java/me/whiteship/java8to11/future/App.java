package me.whiteship.java8to11.future;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hong = () -> {
            Thread.sleep(1000);

            return "hong";
        };

        Callable<String> jung = () -> {
            Thread.sleep(2000);

            return "jung";
        };

        Callable<String> wan = () -> {
            Thread.sleep(3000);

            return "wan";
        };

        String answer = executorService.invokeAny(Arrays.asList(hong, jung, wan));

        System.out.println(answer);

    }
}
