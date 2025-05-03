package com.znaji.method.boxingAndunboxing;

public class MyClass {
    public static void main(String[] args) {
        int a = 10;
        //boxing
        Integer b = Integer.valueOf(a);
        //unboxing:
        int c = b.intValue();

        //autoboxing:
        Integer d = 10;
        //auto-unboxing:
        int e = d;

        //can't have boxing & casting at same time:
        //Long l = 10;
        //->cast manually and compiler autoboxing:
        Long l = 10L;
        //->boxing manually and compiler cast:
        Long ll = Long.valueOf(10);
    }
}
