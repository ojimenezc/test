package com.example.com;

public class Task2 {

    public static int findRepeated(int k, int[] array){
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == k) {
                return array[i];
            }
        }

        return 0;
    }
}
