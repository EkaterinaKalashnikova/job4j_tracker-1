package ru.job4j.anime;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AnomalyyTest {
    @Test
    public void whenNoAnomalyy() {
        int[][] expect = {};
        int[] data = {5, 10, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expect, Anomalyy.foundd(data, up, down));
    }

    @Test
    public void whenOneAnomalyyInPoint() {
        int[][] expect = {new int[] {1, 1}};
        int[] data = {5, 16, 15};
        int up = 16;
        int down = 4;
        int[][] out = Anomalyy.foundd(data, up, down);
        assertArrayEquals(expect, out);
    }

    @Test
    public void whenOneAnomalyyInPointInDiapason() {
        int[][] expect = {new int[] {1, 2}};
        int[] data = {5, 16, 17, 15};
        int up = 16;
        int down = 4;
        assertArrayEquals(expect, Anomalyy.foundd(data, up, down));
    }

    @Test
    public void whenTwoAnomalyyInPointInDiapason() {
        int[][] expect = {new int[] {1, 2}, new int[] {5, 6}};
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Anomalyy.foundd(data, up, down);
        assertArrayEquals(expect, out);
    }

    @Test
    public void whenThreeAnomalyyInPointInDiapason() {
        int[][] expect = {new int[] {1, 3}, new int[] {6, 7},};
        int[] data = {5, 16, 17, 18, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Anomalyy.foundd(data, up, down);
        assertArrayEquals(expect, out);
    }
}