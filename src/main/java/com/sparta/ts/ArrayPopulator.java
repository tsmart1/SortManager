package com.sparta.ts;

import java.util.Random;

public class ArrayPopulator {
    public static int[] populateArray(int[] array){
        Random random = new Random();
        for (int i = array.length-1; i > 0; i--) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
