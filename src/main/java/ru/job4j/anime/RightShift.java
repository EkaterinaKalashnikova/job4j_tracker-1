package ru.job4j.anime;

public class RightShift {
    public static void shift( int[] nums ,int count ) {
        while(count > 0) {
            shift (nums);
            count = count-1;
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift( int[] nums ) {
        int temp = nums[nums.length-1];
        for(int i = nums.length - 1; i > 0; i--) {
            nums[ i ] = nums[ i - 1 ];
        }
        nums[0] = temp;
    }
}


   /** int k = 0;
    int[] nums2 = new int[ nums.length ];
        for(int i = 0; i < nums.length; i++) {
        nums2[ i ] = nums[ i ];
    }
    nums[ 0 ] = nums2[ nums.length-1 ];
        for(int i = 1; i < nums.length; i++) {
        nums[ i ] = nums2[ i-1 ];
    }
}*/

/** int temp=nums[ 0 ];
 for(int i=0; i < nums.length; i++) {
 nums[ i ]=nums[ i-1 ];
 }
 nums[0] = temp;*/


/**
 * int size = nums.length;
 * for (int i = 0; i < count; i++) {
 * int temp = nums[size - 1];
 * for (int j = size - 1; j > 0; j--) {
 * nums[j] = nums[j-1];
 * }
 * nums[0] = temp;
 * }
 * }
 * <p>
 * // метод делает сдвиг с шагом 1
 * private static void shift(int[] nums) {
 * int size = nums.length;
 * int index = 0;
 * for (int i = size; i > index; i--) {
 * int temp = nums[size-1];
 * for (int j = size-1; j > 0; j--) {
 * nums[j] = nums[j-1];
 * }
 * nums[0] = temp;
 * }
 * }
 * }
 */
