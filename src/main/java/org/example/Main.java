package org.example;

import org.example.coding.array.ArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        4
//        3 4 5 2
        int arrayElement[] = {1,0,1,1,1};
        ArrayProblem arrayProblem=new ArrayProblem();
        System.out.println(arrayProblem.findMaxConsecutiveOnes(arrayElement));
    }
}