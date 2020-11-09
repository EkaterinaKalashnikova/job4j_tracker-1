package ru.job4j.lambda;

import java.util.function.Predicate;

public class Example {
    public static boolean check(int num) {
        return check (x -> num > 0, num);
    }

    private static boolean check( Predicate <Integer> predicate,int num) {
        return predicate.test(num);
    }
}


