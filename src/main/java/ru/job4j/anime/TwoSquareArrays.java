package ru.job4j.anime;

public class TwoSquareArrays {
    public static int[] collectArray( int[][] left ,int[][] right ) {
        int[] result = new int[left.length * right.length];
        int index = 0;
        for(int i = 0; i < left.length; i ++) {
            for(int j = 0; j < left[i].length; j ++) {
               if (left[i][j] > right[i][j]) {
                  result[index] = left[i][j];
               } else {
                   result[index] = right[i][j];
               }
               index++;
            }
        }
      return result;
    }
}


/**
 * for(int i = 0; i < left.length; i++) {
 * for(int j = 0; j < left[i].length; j++) {
 * System.out.print(left[i][j] + "	");
 * int count = left.length;
 * result[i * count  + j] = left[i][j];
 * }
 * }
 * int[][] tmp = new int[left.length + right.length][];
 * System.arraycopy (left, 0, tmp, 0, left.length);
 * System.arraycopy(right, 0, tmp, left.length, right.length);
 * <p>
 * int[] result = new  int[tmp.length*tmp.length];
 * for(int i = 0; i < tmp.length; i++) {
 * for(int j = 0; j < tmp[i].length; j++) {
 * System.out.print(tmp[i][j] + "	");
 * int count = tmp.length;
 * result[i * count  + j] = tmp[i][j];
 * }
 * }
 */