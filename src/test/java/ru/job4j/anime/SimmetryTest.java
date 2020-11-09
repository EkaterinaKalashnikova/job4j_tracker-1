package ru.job4j.anime;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Simmetry.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Simmetry.check(123456321);
        assertThat(check, is(false));
    }
}