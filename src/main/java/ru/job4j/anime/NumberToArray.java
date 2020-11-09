package ru.job4j.anime;

public class NumberToArray {
    public static int[] resolve( int number ) {
        int index = 0;
    String str = String.valueOf(number);
       int[] result = new int[str.length()];
        for(int i = str.length() - 1; i >= 0; i--) {
          result[index] = Integer.parseInt(Character.toString((str.charAt(i))));
          index++;
        }
        return result;
    }
}

/** int index = 0;
 String str = String.valueOf(number);
 int[] result = new int[str.length()];
 for(int i = result.length - 1; i > 0; i--) {
 result[index] = i;
 index++;
 }*/

/**  for (int i = 1; i < result.length/2; i++) {
 temp = result[number-i-1];
 result[number-i-1] = result[i];
 result[i] = temp;
 index++;
 }*/

/**   String str=Integer.toString (number);
 int[] result=Integer.toString (number).chars ().map (c -> c-'0').toArray ();
 for(int i : result) {
 System.out.print (i);
 }
 return result;
 }*/