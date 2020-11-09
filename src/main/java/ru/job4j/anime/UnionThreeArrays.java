package ru.job4j.anime;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
   int size = 2 + middle.length / 2 + right.length / 2;
   int [] result = new int [size];
      for(int i = 0; i < size; i ++) {
          if(i == 0) {
              result[i] = left[i];
          }
          if(i % 2 == 0) {
               result[i + 1] = right[i];
          }
          if (i %2 != 0) {
               result[i + 1] = middle[i];
          }
          if(i == left.length - 1) {
              result[result.length - 1] = left[left.length - 1];
              break;
          }
        }
        return result;
    }
}

/**  int l = left.length;
 int m = middle.length;
 int r = right.length;
 int[] result = new int[r + 1];
 int[] resTmp = new int[0];
 int[] res = new int[0];

 for(int i = 0; i < l; i ++) {
 int[] start = Arrays.copyOf (result, left[0]);
 int[] end = Arrays.copyOf (result, left[l - 1]);
 //   res = Arrays.copyOf(result1, result1.length + result2.length);
 // System.arraycopy(result2, 0, res, result1.length, result2.length);
 //   System.arraycopy (result2, 0, res, result1.length, result2.length);
 }

 for(int i = 0; i < m; i ++) {
 int[] resultM = Arrays.stream(middle)
 .filter(value -> value % 2 == 0)
 .toArray();
 resTmp = Arrays.copyOf(res, res.length + resultM.length);
 System.arraycopy(resultM, 0, resTmp, res.length, resultM.length);
 }

 for(int i = 0; i < r; i ++) {
 int[] resultR = Arrays.stream(right)
 .filter(value -> value % 2 != 0)
 .toArray();
 result = Arrays.copyOf(resTmp, resTmp.length + resultR.length);
 System.arraycopy(resultR, 0, result, resTmp.length, resultR.length);
 }*/