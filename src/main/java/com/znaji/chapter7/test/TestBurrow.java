package com.znaji.chapter7.test;

import com.znaji.chapter7.AnotherInterface;
import com.znaji.chapter7.CanBurrow;

public class TestBurrow implements CanBurrow, AnotherInterface {
    @Override
    public Float getSpeed(int age) {
        return null;
    }

    @Override
    public void testDefault() {
        AnotherInterface.super.testDefault();
    }

    public static void main(String[] args) {
        System.out.println(MAX);
        new TestBurrow().testDefault();
        CanBurrow.printMax();
    }
}
