package com.znaji.method.accessModifiers.pond.swan;

import com.znaji.method.accessModifiers.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {
        var motherDuck = new MotherDuck();
        //motherDuck.quack(); --> doesn't compile, bc trying to access package private from a diff package.
        //System.out.println(motherDuck.noise); --> doesn't compile, bc trying to access package private from a diff package.
    }
}
