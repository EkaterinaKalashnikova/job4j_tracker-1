package ru.job4j.anime;

import java.util.Arrays;

public class AndArray {
    public static int[] and( int[] left ,int[] right ) {
        int[] merge = new int[left.length + right.length];
        int k = 0;
        for(int i=0; i < left.length; i++) {
            for(int j=0; j < right.length; j++) {
               if(left[i] == right[j]) {
                   merge[k] = left[i];
                   k++;
               }
            }
        }
       return Arrays.copyOf(merge, k);
    }
}



  /** int i = 0;
   int j = 0;
   int k = 0;
     // for(int k = 0; k < merge.length; k++) {
        while(i < n && j < m) {
            if (left[i] == right[j]) {
                merge[k] = left[i];
            } else merge[k] = 0;
            k++;
        }

        while(i < n) {
            merge[k] = left[i];
            i++;
            k++;
        }

        while(j < m) {
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;
    }
}*/

/** int n = 0;
 if (left.length < right.length ) {
 n = left.length;
 } else {
 n = right.length;
 }
 int[] merge = new int[n];

 for(int i = 0; i < left.length; i++) {
 if (left[i] == right[i]) {
 merge[n] = left[i];
 n++;
 }else merge[n] = 0;
 }*/