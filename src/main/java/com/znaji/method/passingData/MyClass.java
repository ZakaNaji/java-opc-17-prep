package com.znaji.method.passingData;

public class MyClass {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Zakaria");
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(StringBuilder name) {
        name.append(" Naji");
    }


}
