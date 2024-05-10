package org.example.coding.array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayProblem arrayProblem=new ArrayProblem();
        int arr[]={1,2,3,5};
//        System.out.println(arrayProblem.maximumHappinessSum(arr,2));
        int arrx[]= Arrays.stream(arrayProblem.kthSmallestPrimeFraction(arr,3)).toArray();
    }
}
