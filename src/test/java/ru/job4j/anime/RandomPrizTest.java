package ru.job4j.anime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomPrizTest {
    @Test
    public void test() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        assertEquals("car", RandomPriz.random(prizes, 1));
        assertEquals("ticket", RandomPriz.random(prizes, 2));
        assertEquals("flat", RandomPriz.random(prizes, 3));
        assertEquals("house", RandomPriz.random(prizes, 4));

        assertEquals("car", RandomPriz.random(prizes, 5));
        assertEquals("ticket", RandomPriz.random(prizes, 6));
        assertEquals("flat", RandomPriz.random(prizes, 7));
        assertEquals("house", RandomPriz.random(prizes, 8));

        assertEquals("car", RandomPriz.random(prizes, 9));
        assertEquals("ticket", RandomPriz.random(prizes, 10));
        assertEquals("flat", RandomPriz.random(prizes, 11));
        assertEquals("house", RandomPriz.random(prizes, 12));
    }
}