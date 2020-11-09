package ru.job4j.anime;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int profit = 0;
        if ((percent * prize - pay) <= 0) {
            return 0;
        } else profit = (int) (percent * prize - pay);
        return profit;
    }
}
