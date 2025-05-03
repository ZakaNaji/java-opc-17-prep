package com.znaji.method.accessModifiers.pond.duck;

public class GoodDuck {

    public void makeNoise() {
        MotherDuck motherDuck = new MotherDuck();
        System.out.println(motherDuck.noise);// acceptable -> package access
        motherDuck.quack();// acceptable -> package access
    }
}
