package ru.job4j.anime;

public class RandomDream {
    public static String random( String[] prizes, int num) {
        String prize = null;
        int index = 1;
        boolean flag = false;
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < prizes.length; j++) {
                    if (index == num ){
                        prize = prizes[ j ];
                        flag = true;
                        break;
                    }
                    index++;
                }
             if(flag) {
             break;
            }
        }
      return prize;
    }
}


/**
 * for(int j = 0; j < prizes[(bound + i) % prizes.length].length(); j++) {
 * // for(int j = prizes.length; j > 1 ; j ++) {
 * if (bound == num ){
 * prize = prizes[i] ;
 * }
 * }
 * String prize = null;
 * Random bound = new Random();
 * int n = 0;
 * int i = 0;
 * while(i < prizes.length) {
 * n = bound.nextInt(num);
 * int div = n % prizes.length;
 * if (div > 0) {
 * prize = prizes[i + 1];
 * } else if (div == 0) {
 * prize = prizes[prizes.length - 1];
 * }
 * break;
 * }
 */