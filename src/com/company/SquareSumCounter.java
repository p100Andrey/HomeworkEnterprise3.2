package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class SquareSumCounter {

    public int count(int result, int value) {
        result += value * value;
        return result;
    }
}
