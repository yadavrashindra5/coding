package org.example;

import org.example.coding.array.ArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        4
//        3 4 5 2
        int arrayElement[] = {1,1,2,1,3};
        ArrayProblem arrayProblem=new ArrayProblem();
        int result=arrayProblem.longestSubarrayWithSumK(arrayElement,3);
        System.out.println(result);
    }
}