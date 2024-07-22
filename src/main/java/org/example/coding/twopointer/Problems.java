package org.example.coding.twopointer;

import java.util.*;
import java.util.stream.IntStream;

public class Problems {
    public int countPairs(List<Integer> nums, int target) {
//        Approach 1
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;
        while (left < right) {
            if ((nums.get(left) + nums.get(right)) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i < j) {
            //if i=odd and j=odd
//            {3, 1, 2, 4}
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 == 1) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length, i = 0, j = 1, k = 0;
        while (j < n && i < n) {
            if (nums[i] % 2 == 0) {
                i += 2;
            } else if (nums[j] % 2 != 0) {
                j += 2;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }
        return nums;
    }

}
