package me.whiteship.before;

public class Hello {
    private String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }

    public static String printJava() {
        return "Hello, Java!!";
    }

    public String print(String name) {
        return "Hello, " + name;
    }

    public String printName() {
        return "Hello, " + this.name;
    }

}
