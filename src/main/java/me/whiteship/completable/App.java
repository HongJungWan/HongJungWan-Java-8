package me.whiteship.completable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {
        // 쓰레드 2개 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(getRunable("Hello"));
        executorService.submit(getRunable("JinSeok"));
        executorService.submit(getRunable("The"));
        executorService.submit(getRunable("Java"));
        executorService.submit(getRunable("Thread"));

        executorService.shutdown();
    }

    //    Hello pool-1-thread-1
    //    JinSeok pool-1-thread-2
    //    The pool-1-thread-1
    //    Java pool-1-thread-2
    //    Thread pool-1-thread-1

    private static Runnable getRunable(String message) {
        return () -> System.out.println(message + " " + Thread.currentThread().getName());
    }

}
