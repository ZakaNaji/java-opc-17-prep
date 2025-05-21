package com.znaji.chapter7;

public interface AnotherInterface {
    Number getSpeed(int age);
    private void test() {

    }

    default void testDefault() {
        System.out.println("another test for the default behaviour");
    }
}
