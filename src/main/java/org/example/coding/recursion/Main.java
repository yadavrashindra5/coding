package org.example.coding.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();
//        problem.printNatural(5,1);
//        problem.sortArray(new int[]{2, 5, 1, 6, 3, 8});
//        problem.printPattern(5);
//        System.out.println(problem.powerOf(2,2));
//        problem.printStarPattern(5,0);
//        problem.printStarPattern2(5,5);
//        problem.printSubsets(new int[]{1, 2, 3}, 3, 0, "");
//        problem.consecutive(3, "");
//        int arr[]={1,2,3,4,5};
//        System.out.println(problem.checkSorted(arr,0,arr.length));
//        System.out.println(problem.findPathStartToEnd(2,2,0,0,0,""));
//        System.out.println(problem.nthcell(4,0,0));
//        System.out.println(problem.sumOfNatural(5));
//        System.out.println(problem.powerOfN(5,4));
//        problem.countNumberOfDigits(909877000,0);
//        System.out.println(problem.checkPalidrome("1001", 0));
//        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 9};
//        System.out.println(problem.findMinElement(arr, arr.length, 0, Integer.MAX_VALUE));
//        System.out.println(problem.checkArrayIsSorted(arr, 0, arr.length));
//        Stack<Character> stack = new Stack<>();
//        String str = "";
//        System.out.println(problem.checkValidString(str, stack, 0, str.length()));
//        String str1 = "CCB";
//        problem.generateString(str1, "", 0, str1.length());
//        int arr[] = {5, 4, 3, 6, 8, 1, 2};
//        System.out.println(problem.maxElement(arr, 0, arr.length, Integer.MIN_VALUE));
//        problem.printSubsequences("aaa", "", 0, 3);

//        int arr[] = {1, 2, 3};
//        List<List<Integer>> result = new ArrayList<>();
//
//        problem.printSubset(arr, 0, arr.length, "", result);
//        System.out.println(result);

//        problem.printN(7);
        Stack<Integer>stack=new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(3);
        stack.push(6);
        stack.push(5);
        stack.push(1);
        stack.push(8);
//        List<Integer>list=new ArrayList<>();
//        problem.sortStack(stack,stack.size(),list);

//        problem.deleteMiddleElementFromStack(stack,4);
//        System.out.println(stack);
        System.out.println(stack);
        problem.reverseStack(stack);
        System.out.println(stack);
    }
}
