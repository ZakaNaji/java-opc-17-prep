package com.znaji.chapter8.builtin.functions;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<LocalDate> d1 = LocalDate::now;
        Supplier<LocalDate> d2 = () -> LocalDate.now();

        System.out.println(d1.get());
        System.out.println(d2.get());
    }
}
