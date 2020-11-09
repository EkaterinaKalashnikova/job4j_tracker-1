package ru.job4j.anime;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length; i  ++) {
          if(Character.isLetter(string[i])) {
             sb.append(Character.toUpperCase(string[i]));
          } else {
              sb.append(string[i]);
          }
        }
        return sb.toString().toCharArray();
    }
}


//String asString = Arrays.toString(string);
//if(asString.equals(asString.toUpperCase())) {
//     res = string;