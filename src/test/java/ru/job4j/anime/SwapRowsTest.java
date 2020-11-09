package ru.job4j.anime;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapRowsTest {

    @Test
    public void test( ) {
        int[][] data = {
                {1, 2, 3} ,
                {4, 5, 6}
        };
        SwapRows.swap(data ,0 ,1);
        assertArrayEquals(
                new int[][]{
                        {4, 5, 6} ,
                        {1, 2, 3}
                } ,
                data
        );
    }
}
