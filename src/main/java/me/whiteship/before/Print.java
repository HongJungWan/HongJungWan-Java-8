package me.whiteship.before;

public interface Print {

    static void printStatic() {
        System.out.println("print Static");
    }

    void print();

    default void printDefault() {
        System.out.println("print Default");
    }

}
