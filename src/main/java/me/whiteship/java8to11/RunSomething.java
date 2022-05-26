package me.whiteship.java8to11;

@FunctionalInterface // java standard lib에 들어있어서 별도의 import가 되지 않는다.
public interface RunSomething {

    void doIt();

    static void printName() {
        System.out.println("Hong");
    }

    default void printAge() {
        System.out.println("25");
    }

}
