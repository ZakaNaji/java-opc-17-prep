package com.znaji.chapter8.builtin.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("TESTING A CONSUMER");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> m1 = map::put;
        m1.accept("Bannana", 10);
        m1.accept("Orange", 12);
        m1.accept("Apple", 15);
        System.out.println(map);
        /// //////////
        Consumer<String> c1 = s -> System.out.println("1: " + s);
        Consumer<String> c2 = s -> System.out.println("2: " + s);
        c1.andThen(c2).accept("ZN");
    }
}
