package com.sparta.ts;

public class BubbleSorter implements Sort {
    //Swapper swapper = new Swapper();

    @Override
    public int[] runSort(int[] arrayToSort) {
        int numberOfSwaps;
        numberOfSwaps = 0;
        int positionCounter = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[positionCounter] > arrayToSort[positionCounter + 1]) {
                Swapper.swapNumbers(arrayToSort, positionCounter);
                i--;
                numberOfSwaps++;
            } else {
                positionCounter += 1;
            }
        }
        if (numberOfSwaps > 0) {
            runSort(arrayToSort);
        }
        return arrayToSort;
    }
}