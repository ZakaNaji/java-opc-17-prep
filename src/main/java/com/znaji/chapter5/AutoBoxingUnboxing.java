package com.znaji.chapter5;

import static com.znaji.chapter5.Main.test;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        //Integer integer = 5;
        //int i = Integer.valueOf(5);
        //long l = 10; //windening
        //long ll = Integer.valueOf(10); //unboxing + widening
        ////Long lll = 10; // autoboxing + widening not allowed
//
        //test1(Integer.valueOf(10));
        //test1(i);
//
        ////test2(i);//not allowed
//
        //test3(3);
//
        //Number number = 10;
//
        //test1(integer);

        long l = 10l;
        long l1 = Long.valueOf(10);
        long l2 = 10;
        long l3 = Integer.valueOf(10);

        Long L1 = 10L;
        Long L2 = Long.valueOf(10);
       //Long L3 = 10;
       //Long L4 = Integer.valueOf(10);

        short s = 10;
        //short s1 = Integer.valueOf(10).intValue();

        Integer integer1 = 1;
        Integer integer2 = 2;

        //test4(L1, L2);

        test5(new int[]{1, 2, 3}, 1);

    }

    public static void test1(long l) {
        System.out.println("test 1");
    }

    public static void test2(Long l) {
        System.out.println("test 2");
    }

    public static void test3(Number n) {
        System.out.println("test 3");
    }

    public static void test4(Long... ints) {}
    public static void test4(long... integers) {}

    public static void test5(int[] ints, int ... args) {}

    public void test () {
        int i = 0;
        if (i > 0) {
            int b = i++;
        }
    }
}
