package ru.job4j.lambda;

public class Example2 {
    public static int find( int[] array ) {
        int count =1;
        int scount = 0;
        for(int i=1; i < array.length; i++) {
            if ( array[ i-1 ] <= array[ i ] ){
                count++;
                if ( scount < count ){
                    scount = count;
                } else {
                    count=1;
                }
            }
        }
        //return Math.min(count, scount);
        if ( scount < count ){
            return count;
        } else return scount;
    }

    public static void swap( int[][] data ,int src ,int dst ) {
        int t=0;
        for(int i=0; i < data.length; i++) {
            t=data[ src ][ i ];
            data[ src ][ i ]=data[ dst ][ i ];
            data[ dst ][ i ]=t;
        }
    }

    public static String checkNumber(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "Hello, World!!!";
        } else if (number % 5 != 0 && number % 3 == 0 ) {
            return "Hello";
        } else if (number % 5 == 0) {
            return "World";
        } else {
            return "Operation not support";
        }
    }

    public static boolean checkYear(int year) {
        if ( year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if(year % 4 == 0) {
            return true;
        }
        return false;
    }
}


