package ru.job4j.anime;

public class RandomPriz {
    public static String random(String[] prizes, int num) {
        String prize = null;
        int res = 0;
       // res = num%4;
         res = num % prizes.length;
        if(res > 0) {
            prize = prizes[res - 1];
         } else if (res == 0) {
            prize = prizes[prizes.length-1];
        }
        return prize;
    }
}
