package ru.job4j.anime;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
      //  String[] s =left.split(" ");
      //  String[] t = right.split(" ");
      //  HashMap <String, String> stringHashMap = new HashMap <String, String>();
        if (left.length() != right.length()) {
            return false;
        }
        Map <Character, Integer> map = new HashMap<>();
        char[] inArray = left.toCharArray();
        char[] secArray = right.toCharArray();
        for(int i = 0; i < inArray.length; i++) {
            int val = map.computeIfAbsent(inArray[ i ], character -> 0);
            val++;
            putRemoveMapValue(inArray[ i ], val, map);

            val = map.computeIfAbsent(secArray[ i ], character -> 0);
            val--;
            putRemoveMapValue(secArray[ i ], val, map);
        }
       return map.size() == 0;
      //  return true;
    }

    private static void putRemoveMapValue(char ch, int val, Map<Character, Integer> map) {
        if (val == 0){
            map.remove(ch);
        } else {
            map.put(ch, val);
        }
        // return left != null && right != null &&left.hashCode() == right.hashCode() && left.equals(right);
    }


}
