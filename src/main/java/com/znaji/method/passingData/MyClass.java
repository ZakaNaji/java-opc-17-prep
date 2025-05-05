package com.znaji.method.passingData;

public class MyClass {

    public static void main(String[] args) {
        String name = new String("Zakaria");
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name += "Naji";
    }
}
