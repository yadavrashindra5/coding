package org.example.coding.dailyquestion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Problems problems=new Problems();
//        System.out.println(problems.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
        int[] intersect = problems.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(intersect));
    }
}
