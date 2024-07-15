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
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
        return 1;
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set = new TreeSet<>();
        int row = ranges.length;
        int col = ranges[0].length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                set.add(ranges[i][j]);
            }
        }
        int range[] = set.stream().mapToInt(Integer::intValue).toArray();

        int leftIdx = Arrays.binarySearch(range, left);
        int rightIdx = Arrays.binarySearch(range, right);
        if (leftIdx < 0 || rightIdx < 0) {
            return false;
        } else if ((right - left) == (rightIdx - leftIdx)) {
            return true;
        }
        return true;
    }

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum += nums[i];
        }

        int leftSum = 0, result = 0;
        i = 0;
        while (i < (n - 1)) {
            leftSum += nums[i];
            sum -= nums[i];
            if (leftSum >= sum) {
                result++;
            }
            i++;
        }
        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int postfix[] = new int[n];
        int i = 0, prefixProd = 1, postProduct = 1;
        while (i < n) {
            prefixProd *= nums[i];
            prefix[i] = prefixProd;
            i++;
        }
        i = n - 1;
        while (i >= 0) {
            postProduct *= nums[i];
            postfix[i] = postProduct;
            i--;
        }
        int answer[] = new int[n];
        i = 0;
        while (i < n) {
            if (i == 0) {
                answer[i] = postfix[i + 1];
            } else if (i == n - 1) {
                answer[i] = prefix[n - 2];
            } else {
                answer[i] = prefix[i - 1] * postfix[i + 1];
            }
            i++;
        }
        return answer;
    }
}
