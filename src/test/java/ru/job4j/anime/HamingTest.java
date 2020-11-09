package ru.job4j.anime;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HamingTest {
    @Test
    public void checkStringsIs3() {
        int rsl = Haming.checkStrings("2173896", "2233796");
        assertThat(rsl, is(3));
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Haming.checkStrings("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Haming.checkStrings("abcde", "abcde");
        assertThat(rsl, is(0));
    }
}