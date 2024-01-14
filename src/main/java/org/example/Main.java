package org.example;

import org.example.coding.binarysearch.Binary;

public class Main {
    public static void main(String[] args) {

//        4
//        3 4 5 2
//        int arrayElement[] = {1,1,2,1,3};
//        ArrayProblem arrayProblem=new ArrayProblem();
//        int result=arrayProblem.longestSubarrayWithSumK(arrayElement,3);
//        System.out.println(result);
        Binary binary = new Binary();
        int arr[]={3, 4, 4,7,8,10};
        int target=7;
//        System.out.println(binary.searchInsert(arr,target));
        binary.ceilingInSortedArray(arr.length,2,arr);
    }
}