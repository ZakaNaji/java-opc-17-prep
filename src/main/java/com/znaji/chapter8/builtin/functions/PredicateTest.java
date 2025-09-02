package com.znaji.chapter8.builtin.functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        System.out.println(p1.test(""));
        System.out.println(p1.test("Test"));

        BiPredicate<String, String> p2 = String::equalsIgnoreCase;
        System.out.println(p2.test("test", "TEST"));
    }
}
