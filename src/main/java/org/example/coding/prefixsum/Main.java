package org.example.coding.prefixsum;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Prefix prefix=new Prefix();
//        prefix.runningSum(new int[]{1,2,3,4,5});
//        int[] ints = prefix.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
//        System.out.println(Arrays.toString(ints));
        System.out.println(prefix.findMiddleIndex(new int[]{2,5}));
    }
}
