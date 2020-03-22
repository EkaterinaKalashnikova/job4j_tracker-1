package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    public String a;
    public String b;
  //char[] chars = a.toCharArray();
   // char[] chars2 = b.toCharArray();
    @Override
    public int  compare( String left ,String right ) {
        this.a=left;
        this.b=right;
        for(int i=0; i < a.length() & i < b.length(); i++) {
            if (a.charAt(i) < b.charAt(i) ){
                return -1;
            } else if ( a.charAt(i) == b.charAt(i) ){
                return 0;
            } else {
                return 1;
            }
        }
       return this.compare(left, right);
    }
}

