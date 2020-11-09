package ru.job4j.lambda;

public class ExampleRook {
   /** public static boolean check(String left, String right) {

        if(left.charAt(0) == right.charAt(0)) {
           return  true;
        }
        else if(left.charAt(1) == right.charAt(1)) {
           return true;
        }
        return false;
    }*/

    public static boolean check(String l, String r) {
      if(l.charAt(0) == r.charAt(r.length() - 1) | l.charAt(l.length() - 1) != r.charAt(0)) {
       return true;
   }
    // else if (l.trim().length() == 0 && r.trim().length() == 0) {
      else if(l.trim() == "" && r.trim() == "") {
         return true;
      }
        return false;
    }
}
