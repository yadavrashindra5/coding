package org.example.coding.prefixsum;

import java.util.*;
import java.util.stream.IntStream;

public class Prefix {
    public int[] runningSum(int[] nums) {
//        List<Integer>list=new ArrayList<>();
//        int sum=0;
//        for (int i=0;i<nums.length;++i){
//            list.add(sum+nums[i]);
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();

        int result[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }

    public int modifyBinarySearch(int prefixSum[], int target) {
        int sizeOfPrefix = prefixSum.length;
        int startIndex = 0, endIndex = sizeOfPrefix - 1, index = -1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (prefixSum[mid] == target) {
                index = mid;
                return index + 1;
            } else if (prefixSum[mid] < target) {
                index = mid;
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return index + 1;
    }

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] prefixSum = new int[nums.length];
        int[] ans = new int[queries.length];

        Arrays.sort(nums);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        prefixSum[0] = nums[0];

        map.put(prefixSum[0], 1);

        for (int i = 0; i < nums.length; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            map.put(prefixSum[i], i + 1);
        }

        int k = 0;
        for (int query : queries) {
            Map.Entry<Integer, Integer> entry = map.floorEntry(query);
            if (entry != null) {
                ans[k] = entry.getValue();
            }
            k++;
        }
        return ans;
    }

    public int findMiddleIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;

        for (int i : nums) {
            rightSum += i;
        }

        int i = 0, size = nums.length;

        while (i < size) {
            rightSum = rightSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
            i++;
        }
        return -1;
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int i : nums) {
            rightSum += i;
        }

        int i = 0, size = nums.length;
        while (i < size) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
            i++;
        }
        return -1;
    }

    public int maximumPopulation(int[][] logs) {
        int row = logs.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; ++i) {
            int person[] = logs[i];
            int birth = person[0];
            int death = person[1];
            int count = 0;
            for (int j = 0; j < row; ++j) {
                int birthx = logs[j][0];
                if (birthx >= birth && birthx <= death) {
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
        return 1;
    }
}
