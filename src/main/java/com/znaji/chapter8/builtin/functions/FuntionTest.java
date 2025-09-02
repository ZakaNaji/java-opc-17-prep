package com.znaji.chapter8.builtin.functions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FuntionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        System.out.println(f1.apply("test"));

        BiFunction<String, String, String> f2 = String::concat;
        System.out.println(f2.apply("Hi ", "World"));

        UnaryOperator<String> u = String::toUpperCase;
        System.out.println(u.apply("test"));

        BinaryOperator<String> b = String::concat;
        System.out.println(b.apply("Hi ", "people"));
    }
}
