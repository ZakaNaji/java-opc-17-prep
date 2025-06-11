package com.znaji.chapter5;

public class Overloading {
    //public void fly(int a) {
    //    System.out.println("int");
    //}

    /*public void fly(long a) {
        System.out.println("long");
    }*/

    /*public void fly(Integer a) {
        System.out.println("Integer");
    }*/

   /* public void fly(Object o) {
        System.out.println("Object");
    }*/


    public void fly(int... args) {
        System.out.println("var args");
    }
}
