package ru.job4j.anime;

public class EvenVsOdd {
    public static int whoWin( int[] players ) {
        int first = 0;
        int second = 0;
        int games = 0;
        for(int i = 0; i < players.length; i++) {
            if ( i % 2 == 0 ){
                first = first + players[ i ];
            } else {
                second = second + players[ i ];
            }
            if (first > second) {
                games = 1;
            } else if (first == second) {
                games = 0;
            } else games = 2;
        }
        return games;
    }
}
