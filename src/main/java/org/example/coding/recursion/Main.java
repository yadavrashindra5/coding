package org.example.coding.recursion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();
        int arr[] = {0, 1, 3};
        int target = 4;
        System.out.println(problem.findWays(arr,target));
    }
}
