package ru.job4j.anime;

public class SumOfDifferences {
    public static int sum( int[] nums ) {
        int sum=0;
       /** for(int i=0; i < nums.length; i++) {
            if ( i > 0 ){
                sum=( nums[ 0 ]-nums[ nums.length / 2 ] )+( nums[ nums.length / 2 ]-nums[ nums.length-1 ] );
            }*/


            int dif;
            for(int i = 0; i < nums.length - 1; i++) {
                dif = nums[i] - nums[i + 1];
                sum = sum + dif;
            }


        return sum;
    }
}