package com.znaji.method.accessModifiers.pond.swan;

import com.znaji.method.accessModifiers.pond.bird.Bird;
import com.znaji.method.accessModifiers.pond.duck.AnotherDuck;

public class Swan extends Bird {

    public void helpSelf() {
        System.out.println(text);// allowed, bc we access inherited members that are protected
        floating();// allowed, bc we access inherited members that are protected
    }

    public void helpOtherSwan() {
        Swan otherSwan = new Swan();
        System.out.println(otherSwan.text);// allowed bc accessing inherited members
        otherSwan.floating();// allowed bc accessing inherited members
    }

    public void helpOtherBird() {
        Bird otherBird = new Bird();
        //System.out.println(otherBird.text); // doesn't compile bc trying to access protected members of other packages( should eather do it via inherited memeber, or via instances of the subclass.
        //otherBird.floating(); // doesn't compile bc trying to access protected members of other packages( should eather do it via inherited memeber, or via instances of the subclass.

    }

    public void helpAnotherDuck() {
        AnotherDuck anotherDuck = new AnotherDuck();
        //System.out.println(anotherDuck.text); not allowed
    }
}
