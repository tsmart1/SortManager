package com.sparta.ts;

public class ArraySorter implements Sort {
    @Override
    public int[] runSort(int[] arrayToSplit) {
        int[] leftArray = new int[(arrayToSplit.length / 2)];
        int[] rightArray = new int[(arrayToSplit.length / 2)+(arrayToSplit.length % 2)]; //createRightArray(arrayToSplit);
        System.arraycopy(arrayToSplit, 0, leftArray, 0, leftArray.length - 1 + 1);
        System.arraycopy(arrayToSplit, leftArray.length, rightArray, 0, rightArray.length - 1 + 1);
        if (leftArray.length != 1 && rightArray.length != 1) {
            leftArray = runSort(leftArray);
            rightArray = runSort(rightArray);
        } else if (rightArray.length == 2) {
            rightArray = runSort(rightArray);
        } else if (leftArray.length == 2) {
            leftArray = runSort(leftArray);
        }
        //ArrayMerger arrayMerger = new ArrayMerger();
        return ArrayMerger.mergeArray(leftArray, rightArray);
    }
}