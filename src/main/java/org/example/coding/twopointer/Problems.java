package org.example.coding.twopointer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

}
