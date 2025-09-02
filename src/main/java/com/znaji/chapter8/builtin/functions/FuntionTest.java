package com.znaji.chapter8.builtin.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        System.out.println(f1.apply("test"));

        BiFunction<String, String, String> f2 = String::concat;
        System.out.println(f2.apply("Hi ", "World"));
    }
}
