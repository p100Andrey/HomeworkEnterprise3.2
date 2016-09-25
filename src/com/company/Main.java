package com.company;

public class Main {

    public static void main(String[] args) {
        long squareSum = 0;
        MySquareSum mySquareSum = new MySquareSum();
        int[] array = new int[]{3, 4, 5, 6}; // 9+16+25+36=86
        int numberOfThreads = 4; // Intel® Core™ i5-2500K Processor
        squareSum = mySquareSum.getSquareSum(array, numberOfThreads);
        System.out.println("Square's sum of array's values = " + squareSum);
    }
}
