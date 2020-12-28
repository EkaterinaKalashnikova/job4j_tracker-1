package ru.job4j.anime;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found( int[] data ,int up ,int down ) {
        /**    int[][] result = new int[data.length][2];
        int i = 0, j = 0;
        int index = 0;
        int count = 0;
        while (index < data.length) {
            if (data[index] >= up || data[index] <= down) {
                result[i][j] = index;
                j++;
                while ((index + 1 < data.length &&  data[index + 1] >= up)
                        || (index + 1 < data.length && data[index + 1] <= down)) {
                    index++;
                }
                result[i][j] = index;
                j = 0;
                index++;
                i++;
                count++;
            } else {
                index++;
            }
        }
        return Arrays.copyOf(result, count);

       int[][] result = new int[data.length][2];
        int i = 0, j = 0;
        int index = 0;
        int count = 0; //{5, 16, 17, 15, 10, 1, 2};
        while (index < data.length) {
            if (data[index] >= up ) {
                result[i][j] = index;
                j++;
                while (index + 1 < data.length && data[index + 1] >= up) {
                    index++;
                }
                result[i][j] = index;
                j = 0;
                index++;
                i++;
                count++;
            }
            if (data[index] <= down) {
                result[i][j] = index;
                j++;
                while (index + 1 < data.length && data[index + 1] <= down) {
                    index++;
                }
                result[i][j] = index;
                j = 0;
                i++;
                index++;
                count++;
            }
            index++;
        }
        return Arrays.copyOf(result, count);

    }}*/



      int[][] result = new int[data.length][];
        int[] temp = new int[data.length];
        int count = 0; //количество аномалий в строке
        int index = 0; //считаем элементы временного массива
        int m = 0;//
        int k = 0;//количество аномалий, записанных в temp
        boolean flag = false;

        for(int i = 0; i < data.length; i++) {
            if (data[i] < up && data[i] > down) {
                flag = true;
            } else {
                flag = false;
                temp[index] = i;
                index++;
                k++;
            }
            if (flag && k > 0) {
                result[count] = new int[ 2 ];
                count++;
                switch (k) {
                    case 1:
                        result[ m ][ 0 ]  = temp[ 0 ];
                        result[ m ][ 1 ] = temp[ 0 ];
                        m++;
                        break;
                    default:
                        result[ m ][ 0 ] = temp[ 0 ];
                        result[ m ][ 1 ] = temp[k - 1];
                        m++;
                        break;
                }
                Arrays.fill(temp, 0);
                index = 0;
                k = 0;
            }
        }
        if (k > 0) {
            result[count] = new int[ 2 ];
            count++;
            switch (k) {
                case 1:
                    result[ m ][ 0 ] = temp[ 0 ];
                    result[ m ][ 1 ] = temp[ 0 ];
                    m++;
                    break;
                default:
                    result[ m ][ 0 ] = temp[ 0 ];
                    result[ m ][ 1 ] = temp[k - 1];
                    m++;
                    break;
            }
            Arrays.fill(temp, 0);
        }
        return Arrays.copyOf (result, count);
    }
}

