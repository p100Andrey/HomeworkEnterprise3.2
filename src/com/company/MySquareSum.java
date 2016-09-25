package com.company;

public class MySquareSum implements SquareSum {

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        long sum = 0;
        for (int i = 0; i < values.length; ) {
            for (int j = 0; j < numberOfThreads && j < values.length - i; j++) {
                sum = sum + values[j] * values[j];
            }
            i = i + numberOfThreads;
        }
        return sum;
    }
}
