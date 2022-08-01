package me.whiteship.before;

@FunctionalInterface // java standard lib에 들어있어서 별도의 import가 되지 않는다.
public interface RunSomething {

    static void printName() {
        System.out.println("Hong");
    }

    void doIt();

    default void printAge() {
        System.out.println("25");
    }

}
