package ru.job4j.anime;

import java.util.Arrays;

public class OrArray {
    public static int[] or( int[] left ,int[] right ) {
        int[] merge=new int[left.length + right.length];
        int k = 0;
        boolean equal = true;
        if (right.length == 0) {
            for(int i = 0; i < left.length; i++) {
                merge[k] = left[i];
                k++;
            }
        }
        else if (left.length==0) {
            for(int i=0; i < right.length; i++) {
                merge[k] = right[i];
                k++;
            }
        }
        else if (right.length != 0 && left.length != 0) {
            for(int i = 0; i < left.length; i++) {
                merge[k] = left[i];
                k++;
            }
            for(int i = 0; i < right.length; i++) {
                for(int j = 0; j < left.length; j++) {
                    if(right[i] == left[j]) {
                        equal = false;
                    }
                }
                if(equal) {
                    merge[k] = right[i];
                    k++;
                }
                else {
                    equal = true;
                }
            }
        }
       /** for(int i=0; i < left.length; i++) {
            merge[ i ] = left[ i ];
            k++;
        }

        for(int j=0; j < right.length; j++) {
            merge[k++] = right[ j ];
        }*/
        return Arrays.copyOf (merge,k);
    }
}


/**
 * boolean flag=false;
 * if ( right.length == 0 ){
 * for(int i=0; i < left.length; i++) {
 * merge[ k ]=left[ i ];
 * k++;
 * }
 * } else if ( left.length == 0 ){
 * for(int i=0; i < right.length; i++) {
 * merge[ k ]=right[ i ];
 * k++;
 * }
 * } else if ( right.length > 0 && left.length > 0 ){
 * for(int i=0; i < left.length; i++) {
 * merge[ k ]=left[ i ];
 * k++;
 * }
 * for(int i=0; i < left.length; i++) {
 * for(int j=0; j < right.length; j++) {
 * if ( left[ i ] == right[ j ] ){
 * flag=true;
 * } else
 * flag=false;
 * }
 * if ( flag ){
 * merge[ k ]=right[ i ];
 * k++;
 * } else {
 * flag=true;
 * }
 * }
 * } } else if (right.length > 0 && left.length > 0) {
 * for(int i=0; i < left.length; i++) {
 * for(int j=0; j < right.length; j++) {
 * if ( left[ i ] == right[ j ] ){
 * merge[ k ]=left[ i ];
 * k++;
 * }
 * if (left[ i ] != right[ j ]){
 * merge[ k ]=left[ i ];
 * k++;
 * merge[ k ]=right[ j ];
 * k++;
 * }
 * }
 * }
 * }
 * return Arrays.copyOf(merge ,k);
 * }
 * }
 * } else if (right.length > 0 && left.length > 0) {
 * for(int i=0; i < left.length; i++) {
 * for(int j=0; j < right.length; j++) {
 * if ( left[ i ] == right[ j ] ){
 * merge[ k ]=left[ i ];
 * k++;
 * }
 * if (left[ i ] != right[ j ]){
 * merge[ k ]=left[ i ];
 * k++;
 * merge[ k ]=right[ j ];
 * k++;
 * }
 * }
 * }
 * }
 * return Arrays.copyOf(merge ,k);
 * }
 * }
 */


/** } else if (right.length > 0 && left.length > 0) {
 for(int i=0; i < left.length; i++) {
 for(int j=0; j < right.length; j++) {
 if ( left[ i ] == right[ j ] ){
 merge[ k ]=left[ i ];
 k++;
 }
 if (left[ i ] != right[ j ]){
 merge[ k ]=left[ i ];
 k++;
 merge[ k ]=right[ j ];
 k++;
 }
 }
 }
 }
 return Arrays.copyOf(merge ,k);
 }
 }*/