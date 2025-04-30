package com.znaji.object.initialization;

public class SubClass extends SuperClass {
    int x = 10; // Step 2
    {
        System.out.println("SubClass Instance Initializer");
    }
    SubClass() {
        System.out.println("SubClass Constructor"); // Step 3
    }
}
