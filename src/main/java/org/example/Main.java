package org.example;

import org.example.coding.array.ArrayProblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        4
//        3 4 5 2
        int arrayElement[] = {3,4,5,2};
        ArrayProblem arrayProblem=new ArrayProblem();
        int largestElement[]=arrayProblem.secondLargestElement(arrayElement,arrayElement.length);
        System.out.println(Arrays.toString(largestElement));
    }
}