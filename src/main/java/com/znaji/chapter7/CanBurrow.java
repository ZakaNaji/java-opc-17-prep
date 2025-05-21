package com.znaji.chapter7;

public interface CanBurrow {
    Float getSpeed(int age);

    default void testDefault() {
        System.out.println("testing the default behaviour");
    }

    static void printMax() {
        System.out.println(MAX);
    }
    
    final static int MAX = 1000;
}
