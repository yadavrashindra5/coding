package org.example.coding.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SlidingWindowProblem s = new SlidingWindowProblem();
//        s.maximumSum(new int[]{1,5,4,2,9,9,9},5);
//        s.countGoodSubstrings("xyzzak");
//        int arr[]={1,2,3,4};
//        int k=0;
//        s.decrypt(arr,k);

//        ArrayList<String>strings=new ArrayList<>();
//        strings.add("bcbbbcba");
//        strings.add("aaaa");
//        strings.add("bcaab");
//        strings.forEach(s1 -> s.maximumLengthSubstring(s1));

//        s.findFirstNegInWindow(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3);

        s.findAnagramsIndices("CBAEBABACD", 10, "ABC", 3);
        s.findAnagramsIndices("ABADE", 5, "BA", 2);
        s.findAnagramsIndices("BACDGABCDA",10,"ABCD",4);
        s.findAnagramsIndices("ABABABA",7,"A",1);
    }
}
