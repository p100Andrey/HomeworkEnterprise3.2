package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountExecutorTest {
    private int numberOfThreads;
    private CountExecutor countExecutor;

    @Before
    public void testBefore(){
        countExecutor = new CountExecutor();
        numberOfThreads = Runtime.getRuntime().availableProcessors();
    }

    @Test
    public void testGetSquareSum() throws Exception {
        int[] values = new int[]{1, 2, 3, 4, 1, 1, 1, 1, 1};
        assertEquals(35, countExecutor.getSquareSum(values, numberOfThreads));
    }

    @Test
    public void testGetSquareSumZero() throws Exception {
        int[] values = new int[]{};
        assertEquals(0, countExecutor.getSquareSum(values, numberOfThreads));
    }

}