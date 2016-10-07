package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] values = new int[]{1, 2, 3, 4, 1, 2, 3, 4, 1};

        MySquareSum mySquareSum = new MySquareSum();
        long squareSumOfArray = mySquareSum.getSquareSum(values, numberOfThreads);
        System.out.println("Sum of squares of array elements = " + squareSumOfArray + ";");
    }
}