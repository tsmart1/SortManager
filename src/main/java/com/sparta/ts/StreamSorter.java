package com.sparta.ts;

import java.util.Arrays;

public class StreamSorter implements Sort {
    @Override
    public int[] runSort(int[] arrayToSort) {
        return Arrays.stream(arrayToSort)
                .sorted()
                .toArray();
    }
}
