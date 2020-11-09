package ru.job4j.lambda;

public class ExampleOperation {
    public static int calculate(int[] hours) {
        int x = 10;
        int y = 15;
        int sum = 0;
        int over = 0;
        for(int i = 0; i < hours.length; i ++) {
            if (i <= 4 && hours[ i ] <= 8) {
                sum = sum + hours[ i ] * x;
            } else if (i <= 4 && hours[ i ] > 8) {
                over = hours[ i ] - 8;
                sum = sum + 8 * x + (hours[ i ]-8) * y;
            } else if (i > 4 && hours[ i ] <= 8 ) {
                sum = sum  + hours[ i ]* x * 2;
            } else if (i > 4 && hours[ i ] > 8) {
                over = hours[ i ] - 8;
                sum = sum +  8 * x * 2 + over * y * 2;
            }
        }
        return sum;
    }
}
