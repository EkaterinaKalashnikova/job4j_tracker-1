package ru.job4j.anime;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EvenVSOddTest {
    @Test
    public void whenWinOdd() {
        assertEquals(2, EvenVsOdd.whoWin(new int[] {5, 10, 4, 3}));
    }

    @Test
    public void whenWiEven() {
        assertEquals(1, EvenVsOdd.whoWin(new int[] {10, 5, 4, 3}));
    }

    @Test
    public void whenNobody() {
        assertEquals(0, EvenVsOdd.whoWin(new int[] {6, 5, 4, 5}));
    }

}