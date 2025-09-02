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

        var txt = "brown egg";
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEgg = egg.and(brown);
        Predicate<String> otherEgg = egg.and(brown.negate());
        System.out.println(brownEgg.test(txt));
        System.out.println(otherEgg.test(txt));

    }
}
