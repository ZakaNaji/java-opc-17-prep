package com.znaji.classes;

import java.io.FileNotFoundException;
import java.io.IOException;



abstract class Test {
    private int num;
    static StringBuilder sb = new StringBuilder();
     static void test() throws IOException{}
}

class SubTest extends Test {
    private int num;
    static {
        sb.append("a");
    }

    static void test(short s) {
        System.out.println(s);
    }
    public static void main(String[] args) throws IOException {
        test();
    }

    static void fly(long l) {
        System.out.println("LONG");
    }


    static void fly(int ints) {
        System.out.println("INT VARARGS");
    }

    static void fly(Integer integers) {
        System.out.println("INTEGERS VARARGS");
    }
}