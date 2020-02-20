package com.sparta.ts;

import java.util.Arrays;

public class SortTimeTester {
    static void timeSort (Sort sort) {
        timeSort(sort,ArrayPopulator.populateArray(new int[100]));
    }

    static void timeSort (Sort sort, int[] arrayToSort) {
        long startTime = System.nanoTime();
        int[] sortOutput = sort.runSort(arrayToSort);
        long endTime = System.nanoTime();
        System.out.println(sort.getClass().getSimpleName()+ " took: " + ((endTime-startTime))+ " ns");
        System.out.println(Arrays.toString(sortOutput));
    }
}
