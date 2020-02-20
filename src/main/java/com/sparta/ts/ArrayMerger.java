package com.sparta.ts;

public class ArrayMerger {
    public static int[] mergeArray(int[] arrayOne, int[] arrayTwo) {
        int arrayOnePointer = 0;
        int arrayTwoPointer = 0;
        int outputArrayPointer = 0;
        int[] outputArray = new int[(arrayOne.length + arrayTwo.length)];
        while (arrayOnePointer < arrayOne.length && arrayTwoPointer < arrayTwo.length) {
            if (arrayOne[arrayOnePointer] < arrayTwo[arrayTwoPointer]) {
                outputArray[outputArrayPointer++] = arrayOne[arrayOnePointer++];
            } else {
                outputArray[outputArrayPointer++] = arrayTwo[arrayTwoPointer++];
            }
        }
        if (arrayOnePointer == arrayOne.length) {
            while (arrayTwoPointer != arrayTwo.length) {
                outputArray[outputArrayPointer++] = arrayTwo[arrayTwoPointer++];
            }
        } else {
            while (arrayOnePointer != arrayOne.length) {
                outputArray[outputArrayPointer++] = arrayOne[arrayOnePointer++];
            }
        }
        return outputArray;
    }
}