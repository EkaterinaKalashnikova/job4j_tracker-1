package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first ,int denominator ,int count ) {
        List <Integer> data=new ArrayList <>();
        int i=0;
        int sum=0;
        while(i < count) {
            //data.add ((int) ( first * Math.pow(denominator, i)));
            data.add (first * power(denominator, i));
            sum += data.get(i);
            i++;
        }
        return sum;
    }

    public static int power(int number, int rank) {
        if(rank == 0) {
            return 1;
        }
        return number*power(number, rank - 1);
    }
}