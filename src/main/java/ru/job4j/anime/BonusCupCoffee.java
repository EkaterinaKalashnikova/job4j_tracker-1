package ru.job4j.anime;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int sum = 0; //
        if (count / n > 0) {
           sum = count + count / n;
        }
        return sum;
    }
}
