package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Example2Test {
    @Test
    public void test() {
        assertEquals(1, Example2.find(new int[] {1}));
        assertEquals(1, Example2.find(new int[] {2, 1}));
        assertEquals(2, Example2.find(new int[] {1, 2}));
        assertEquals(4, Example2.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, Example2.find(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, Example2.find(new int[] {3, 2, 1}));
    }

    @Test
    public void checkNumberHelloWorld() {
        String s = Example2.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = Example2.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = Example2.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = Example2.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }

    @Test
    public void checkYearFalse() {
        boolean b = Example2.checkYear(2019);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearFalse1() {
        boolean b = Example2.checkYear(1800);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearTrue() {
        boolean b = Example2.checkYear(2020);
        assertThat(b, is(true));
    }

    @Test
    public void checkYearTrue1() {
        boolean b = Example2.checkYear(2000);
        assertThat(b, is(true));
    }
}