package com.znaji.chapter8.methodereference;

public class Student {
    public static void main(String[] args) {
        learnToSpeakAWord("Hello", s -> System.out.println(s));
        learnToSpeakAWord("Hello", System.out::println);// same thing with method reference

        //static method ref
        Converter converter = Math::round;
        Converter converter1 = d -> Math.round(d);//same but more verbose

        //instance method ref:
        var text = "";
        StringCheck stringCheck = text::isEmpty;
        System.out.println(stringCheck.check());

    }

    public static void learnToSpeakAWord(String word, Learn learn) {
        learn.speak(word);
    }
}
@FunctionalInterface
interface Converter {
    long convert(double d);
}

interface StringCheck{
    boolean check();
}