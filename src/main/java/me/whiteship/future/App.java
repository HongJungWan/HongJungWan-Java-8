package me.whiteship.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        boolean throwError = true;

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (throwError) throw new IllegalArgumentException();
            System.out.println(Thread.currentThread().getName());

            return "daydream";
        }).handle((result, ex) -> {
            if (ex != null) return "error!";

            return result;
        });

        System.out.println(future.get());

    }
}
