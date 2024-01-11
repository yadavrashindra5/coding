package org.example.coding.binarysearch;

import java.util.Collections;
import java.util.List;

public class Binary {

    /**
     *
     * https://leetcode.com/problems/binary-search/
     *
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
     *
     *
     * 704. Binary Search
     *
     * */
    public int binarySearch(int arr[], int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }

    /**
     * https://www.codingninjas.com/studio/problems/lower-bound_8165382
     *
     * find the lower bound
     *
     *
     * */

    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low=0,high=n-1;
        int index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                index=mid;
                high=mid-1;
            }else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(high==n-1){
            index=high+1;
        }
        return low;
    }

    /**
     * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
     * <p>
     * <p>
     * 2824. Count Pairs Whose Sum is Less than Target
     * <p>
     * Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
     */
    public int countPairs(List<Integer> nums, int target) {
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
