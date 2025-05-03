package com.znaji.method.accessModifiers.pond.duck;

public class BadDuck {

    public void makeNoise() {
        var fatherDuck = new FatherDuck();
        //System.out.println(fatherDuck.noise); -> doesn't compile
        //System.out.println(fatherDuck.quack()); -> doesn't compile
    }
}
