package com.znaji.chapter7.enums.use.enums;

import com.znaji.chapter7.enums.Season;

public class Main {
    public static void main(String[] args) {
        var s = Season.SUMMER;
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(Season.SUMMER.hashCode());
        System.out.println(season.hashCode());
        System.out.println(s.hashCode());

        //values and ordinal
        for (Season seasonValue : Season.values()) {
            System.out.println(seasonValue.name() + " " + seasonValue.ordinal());
        }

        //value of:
        var winter = Season.valueOf("WINTER");
        System.out.println(winter);

        //switch:
        var fall = Season.FALL;
        switch (fall) {
            case WINTER -> System.out.println("DDDD its cold here!");
            case FALL -> System.out.println("Time of the Fall!");
            case SUMMER -> System.out.println("Time for pool");
            default -> System.out.println("spring maybe?");
        }

        //call enum methods:
        System.out.println(Season.SUMMER.getNumOfVisitors());
        //abstract methode declared in the enum(each value must have an impl)
        System.out.println(Season.SPRING.getWorkingHours());
        //inherited from interface(each enum value must impl it, or have a default impl in the enum level:
        System.out.println(Season.WINTER.avgTemp());
        System.out.println(s.avgTemp());
    }
}
