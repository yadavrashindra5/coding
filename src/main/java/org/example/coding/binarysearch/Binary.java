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

    /**
     *
     * You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
     * Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.
     *
     * Implement Upper Bound
     *
     * */
    public  int upperBound(int []arr, int x, int n){
        int low=0,high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }

    /**
     *
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * 35. Search Insert Position
     *
     * https://leetcode.com/problems/search-insert-position
     *
     *
     * **/

    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int index=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else{
                index=mid;
                low=mid+1;
            }
        }
        return index+1;
    }

    /**
     *
     * You're given a sorted array 'a' of 'n' integers and an integer 'x'.
     *
     *
     *
     * Find the floor and ceiling of 'x' in 'a[0..n-1]'.
     *
     *
     * https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401
     *
     *
     *
     * **/
    public  void ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        int low=0,high=n-1;
        int floorElement=-1,ceilingElement=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                floorElement=arr[mid];
                break;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                floorElement=arr[mid];
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                ceilingElement=arr[mid];
                break;
            }else if(arr[mid]>x){
                ceilingElement=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println(floorElement+" "+ceilingElement);
    }
    public int findFirst(int nums[],int target){
        int low=0,high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }

    public int findLast(int nums[],int target){
        int low=0,high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }

    /*
    * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
    *
    *
    * 34. Find First and Last Position of Element in Sorted Array
    *
    * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    *
    * */
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }

    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public boolean searchTargetInRotatedSortedArray(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates at the start or end of the array
            while (low < mid && nums[low] == nums[mid]) {
                low++;
            }

            while (high > mid && nums[mid] == nums[high]) {
                high--;
            }

            // Check which half is sorted
            if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
