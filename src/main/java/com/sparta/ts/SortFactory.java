package com.sparta.ts;

public class SortFactory {
    public static Sort getSort(String typeOfSort) {
        switch (typeOfSort) {
            case "array sort":
                return new ArraySorter();
            case "bubble sort":
                return new BubbleSorter();
            case "stream sort":
                return new StreamSorter();
            case "binary sort":
                return new BinaryTreeImpl();
            default: // defaults to bubble sort
                return new BubbleSorter();
        }
    }
}
