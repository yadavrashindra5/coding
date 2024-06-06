package org.example.coding.array;

import org.example.tree.*;

public class Main {
    public static void main(String[] args) {
        ArrayProblem arrayProblem=new ArrayProblem();
        int arr[]={1,2,3,5};
//        System.out.println(arrayProblem.maximumHappinessSum(arr,2));
        int grid[][]={{1,7},{1,1}};
        System.out.println(arrayProblem.satisfiesConditions(grid));
    }
}
