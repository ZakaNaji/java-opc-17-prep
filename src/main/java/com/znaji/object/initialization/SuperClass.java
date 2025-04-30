package com.znaji.object.initialization;

public class SuperClass {
    int a = 5; // Step 1
    {
        System.out.println("SuperClass Instance Initializer");
    }
    SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}
