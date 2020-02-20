package com.sparta.ts;

public class Swapper {

    public static void swapNumbers(int[] arrayToSwap, int position) {
        int storeNumber;
        storeNumber = arrayToSwap[position];
        arrayToSwap[position] = arrayToSwap[position+1];
        arrayToSwap[position+1] = storeNumber;
    }
}