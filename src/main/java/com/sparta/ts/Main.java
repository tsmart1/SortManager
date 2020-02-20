package com.sparta.ts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        BinaryTreeImpl binaryTree = new BinaryTreeImpl(new int[]{1,2,3,4,5,6,7,8});
//        System.out.println(Arrays.toString(binaryTree.getSortedTreeDesc()));
        SortTimeTester.timeSort(SortFactory.getSort("bubble sort"),new int[]{2,6,2,6,3,2,5,2,1,7,5,4});
        SortTimeTester.timeSort(SortFactory.getSort("bubble sort")); // Not putting in an array to sort will do it on a random int array of 100 values.
    }
}