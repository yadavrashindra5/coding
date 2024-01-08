package org.example;

import org.example.coding.array.ArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        4
//        3 4 5 2
        int arrayElement[] = {-1,-100,3,99};
        ArrayProblem arrayProblem=new ArrayProblem();
        arrayProblem.rotate(arrayElement,2);
    }
}