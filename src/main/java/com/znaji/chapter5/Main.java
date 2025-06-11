package com.znaji.chapter5;

public class Main {
    final public static void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.fly();// exact match -> widening -> autoboxing/unboxing -> varargs
    }
}
