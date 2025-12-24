package org.example.coding.prefixsum;

import java.util.Arrays;

public class Main {
    public static int prefixSumOfLR(int[] arr, int left, int right) {
        int sum = 0;
        while (left <= right) {
            sum += arr[left++];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 6};
        int[][] queries = {
                {0, 2},
                {1, 3},
                {2, 5}
        };
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            result[i] = prefixSumOfLR(arr, queries[i][0], queries[i][1]);
        }
        System.out.println(Arrays.toString(result));
    }
}
