package com.znaji.method.staticMembers;

public class MyClass {

    public  final String HI;
    public final static MyClass staticMyClass;

     {
        HI = "Hi!";
    }

    static {
         staticMyClass = new MyClass();
    }



    public static void greeting() {
        System.out.println(staticMyClass.HI);
    }
}
