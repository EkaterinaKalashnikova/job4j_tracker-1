package ru.job4j.anime;

import java.util.Scanner;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {

        int sum = 0;
        for(int i = 0; i < data.length; i ++) {
            sum = sum + data[i];
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;

        System.out.println("sum +" + sum);
    }

}
