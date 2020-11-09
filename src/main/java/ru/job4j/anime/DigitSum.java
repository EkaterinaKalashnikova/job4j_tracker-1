package ru.job4j.anime;

public class DigitSum {
    public static int sum(int num) {
    int sum = 0;
        /**  while (num != 0) { //Суммирование цифр числа
            sum += (num % 10);
            num /= 10;
        }*/
           String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            sum = sum + Integer.parseInt(Character.toString((str.charAt(i))));
        }
        return sum;
    }
}
