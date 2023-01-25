package com.example.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// TASK 1 - Intersection
        System.out.println("**************TASK 1***************");
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        int[] res = Task1.intersection(a,b);
        System.out.println("Result intersection 1");
        Arrays.stream(res).forEach(i -> System.out.println(i));

        int[] a2 = {4,9,5};
        int[] b2 = {9,4,9,8,4};
        int[] res2 = Task1.intersection(a2,b2);
        System.out.println("Result intersection 2");
        Arrays.stream(res2).forEach(i -> System.out.println(i));


        System.out.println("**************TASK 2***************");

        //TASK 2 Find repeated

        int[] repeated  = {1,2,3,3,4,5,3,6,6};
        int k = 2;
        System.out.println(String.format("Repeated item for k=%s is %s",k,Task2.findRepeated(k,repeated)));

    }
}
