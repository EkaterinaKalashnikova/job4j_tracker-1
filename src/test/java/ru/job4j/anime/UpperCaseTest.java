package ru.job4j.anime;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UpperCaseTest {
    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }
}