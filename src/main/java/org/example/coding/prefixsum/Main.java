package org.example.coding.prefixsum;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Prefix prefix = new Prefix();
//        prefix.runningSum(new int[]{1,2,3,4,5});
//        int[] ints = prefix.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
//        System.out.println(Arrays.toString(ints));
        int ranges[][] = {{1, 2}, {3, 4}, {5, 6}};
        int left = 2, right = 5;
        System.out.println(prefix.isCovered(ranges, left, right));
        prefix.productExceptSelf(new int[]{1, 2, 3, 4});
    }
}
