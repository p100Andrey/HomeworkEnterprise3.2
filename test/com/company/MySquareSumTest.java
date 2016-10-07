package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySquareSumTest {

    @Test
    public void testGetSquareSum() throws Exception {
        MySquareSum mySquareSum = new MySquareSum();
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] values = new int[]{1, 2, 3, 4, 1, 1, 1, 1, 1};
        assertEquals(35, mySquareSum.getSquareSum(values, numberOfThreads));
    }

    @Test (expected = NullPointerException.class)
    public void testGetSquareSumNull() throws Exception {
        MySquareSum mySquareSum = new MySquareSum();
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] values = null;
        assertEquals(0, mySquareSum.getSquareSum(values, numberOfThreads));
    }

    @Test
    public void testGetSquareSumZero() throws Exception {
        MySquareSum mySquareSum = new MySquareSum();
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] values = new int[]{};
        assertEquals(0, mySquareSum.getSquareSum(values, numberOfThreads));
    }

}