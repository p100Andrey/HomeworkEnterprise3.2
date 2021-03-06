package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int[] values = new int[]{1, 2, 3, 4, 1, 2, 3, 4, 1};

        CountExecutor countExecutor = new CountExecutor();
        long squareSumOfArray = countExecutor.getSquareSum(values, numberOfThreads);
        System.out.println("Sum of squares of array elements = " + squareSumOfArray + ";");
    }
}