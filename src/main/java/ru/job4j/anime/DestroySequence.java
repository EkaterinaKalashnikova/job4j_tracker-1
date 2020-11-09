package ru.job4j.anime;

public class DestroySequence {
    public static char[] destroy( char[] seq ) {
        char start = '0';
        char end = '1';

        for(int i = 0; i < 5; i++) {
            if (seq[ i ] == start){
                seq[ i ] = end;
            } else if (seq[ i ] == end) {
                seq[ i ]=start;
            }
        }
        for(int j = seq.length - 5; j < seq.length; j++) {
            if ( seq[j] == start){
                seq[ j ] = end;
            }else if (seq[ j] == end) {
                seq[ j ]=start;
            }
        }
        return seq;
    }
}
