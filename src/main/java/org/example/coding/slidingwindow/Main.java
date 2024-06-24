package org.example.coding.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SlidingWindowProblem s = new SlidingWindowProblem();
//        s.maximumSum(new int[]{1,5,4,2,9,9,9},5);
//        s.countGoodSubstrings("xyzzak");
//        int arr[]={1,2,3,4};
//        int k=0;
//        s.decrypt(arr,k);

        ArrayList<String>strings=new ArrayList<>();
        strings.add("bcbbbcba");
        strings.add("aaaa");
        strings.add("bcaab");
        strings.forEach(s1 -> s.maximumLengthSubstring(s1));
    }
}
