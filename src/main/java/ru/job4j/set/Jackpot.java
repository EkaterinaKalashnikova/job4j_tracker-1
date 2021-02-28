package ru.job4j.set;

        import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin( String[] combination ) {
        boolean flag = false;
        Set <String> stringSet = new HashSet<>();
        //stringSet.addAll (Arrays.asList (combination));
        for(String s: combination) {
            stringSet.add(s);
        }
        // int a = stringSet.size();
        // System.out.println (a);
        return stringSet.size() == 1 ? true : false;
    }
}
