package com.example.com;

import java.util.Arrays;

public class Task1 {

    /*
    * Using streams we can find the intersection
    *
    * * * */
    public static int[] intersection(int[] array1, int[] array2){
            return Arrays.stream(array1)
                    .distinct()
                    .filter(x -> Arrays.stream(array2).anyMatch(y -> y == x))
                    .toArray();
    }
}
