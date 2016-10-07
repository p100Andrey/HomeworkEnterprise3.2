package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MySquareSum implements SquareSum {

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        Phaser phaser = new Phaser(1);
        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);

        List<Future<Integer>> futureResults = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            phaser.register();
            int newLength = ((values.length / numberOfThreads) + 1) * numberOfThreads;
            int[] newTempArray = new int[newLength];
            for (int k = 0; k < values.length; k++) {
                newTempArray[k] = values[k];
            }
            int start = i * (newTempArray.length / numberOfThreads);
            int finish = (i + 1) * (newTempArray.length / numberOfThreads);
            futureResults.add(service.submit(() -> {
                int result = 0;
                for (int j = start; j < finish; j++) {
                    result += newTempArray[j] * newTempArray[j];
                }
                phaser.arrive();
                return result;
            }));
        }

        phaser.arriveAndAwaitAdvance();
        service.shutdown();

        int sum = 0;
        for (Future<Integer> subSum : futureResults) {
            try {
                sum = sum + subSum.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
