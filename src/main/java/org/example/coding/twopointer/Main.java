package org.example.coding.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Problems problems = new Problems();
//        List<Integer>list=new ArrayList<>();
//        list.add(-6);
//        list.add(2);
//        list.add(5);
//        list.add(-2);
//        list.add(-7);
//        list.add(-1);
//        list.add(3);
//        System.out.println(problems.countPairs(list,-2));

//        int nums[] = {3, 1, 2, 3};
//        System.out.println(Arrays.toString(problems.sortArrayByParity(nums)));
//        System.out.println(Arrays.toString(problems.sortArrayByParityII(new int[]{2,5,3,4})));
        System.out.println(Arrays.toString(problems.sortedSquares(new int[]{-3,0,2,3,11})));
//        System.out.println(Arrays.toString(problems.shortestToChar("loveleetcode",'e')));
    }
}
