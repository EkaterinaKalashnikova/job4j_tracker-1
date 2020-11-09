package ru.job4j.anime;

public class Initials {
    public static String convert( String[] fio ) {
        StringBuilder sb = new StringBuilder(3);
        for(int i = 0; i < fio.length; i += 3) {
             if(fio[i] != null ) {
                 String name = fio[0];
                 sb.append(name)
                   .append(' ')
                   .append(fio[i + 1].charAt(0))
                   .append (".")
                   .append(fio[i + 2].charAt(0))
                   .append (".");
             }
        }
        return sb.toString ();
    }
}
