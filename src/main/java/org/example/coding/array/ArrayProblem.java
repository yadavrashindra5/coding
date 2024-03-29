package org.example.coding.array;

import java.util.Arrays;

public class ArrayProblem {

    /**
     * Find Largest element from an array
     * https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
     * <p>
     * level :- easy
     */
    public int largestElement(int arrayElement[]) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arrayElement.length; ++i) {
            if (largestElement < arrayElement[i]) {
                largestElement = arrayElement[i];
            }
        }
        return largestElement;
    }

    /**
     * second largest element
     */
    public int secondLargest(int size, int[] arrayElement) {
        int largElet = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;
        for (int i = 0; i < size; ++i) {
            if (largElet < arrayElement[i]) {
                secLargest = largElet;
                largElet = arrayElement[i];
            } else if (largElet > arrayElement[i] && secLargest < arrayElement[i]) {
                secLargest = arrayElement[i];
            }
        }
        return secLargest;
    }

    /**
     * second smallest element
     */
    public int secSmallest(int size, int[] arrayElement) {
        int largElet = Integer.MAX_VALUE;
        int secLargest = Integer.MAX_VALUE;
        for (int i = 0; i < size; ++i) {
            if (largElet > arrayElement[i]) {
                secLargest = largElet;
                largElet = arrayElement[i];
            } else if (largElet < arrayElement[i] && secLargest > arrayElement[i]) {
                secLargest = arrayElement[i];
            }
        }
        return secLargest;
    }

    /**
     * Find second largest element from an array
     * https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960
     */
    public int[] secondLargestElement(int arrayElement[], int size) {
        int secondS = secSmallest(size, arrayElement);
        int secondL = secondLargest(size, arrayElement);
        int array[] = new int[2];
        array[0] = secondL;
        array[1] = secondS;
        return array;
    }

    /**
     *Remove Duplicates from Sorted Array
     *
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
     *
     * */

    public int removeDuplicates(int nums[]) {
        int i = 0, j = 0;
        int lengthOfNums = nums.length;
        while (j < lengthOfNums) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i;
    }

    /**
     *
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     * https://leetcode.com/problems/rotate-array/
     *
     * */
    public void rotate(int[] nums, int k) {
        int index=nums.length-k;
        nums=reverseArray(nums,0,index-1);
        nums=reverseArray(nums,index,nums.length-1);
        nums=reverseArray(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * reverse array
     *
     *
     *
     * */
    public int [] reverseArray(int nums[],int startIndex,int endIndex){
        while(startIndex<endIndex){
            int temp=nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
        return nums;
    }

    /*
    * Move Zeroes
    *
    * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    *
    * https://leetcode.com/problems/move-zeroes/description/
    *
    *
    * */
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[i]!=0&&nums[j]!=0){
                i++;
            }else if(nums[i]==0&&nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
    }

    /*
    *
    * Missing Number
    *
    *
    *Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    *
    *
    * */
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int sum1=nums.length*(nums.length+1)/2;
        return sum1-sum;
    }

    /**
     *
     * https://leetcode.com/problems/max-consecutive-ones/
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     * 485. Max Consecutive Ones
     * */
    public int findMaxConsecutiveOnes(int[] nums) {
        int numsSize=nums.length;
        int lengthOfOnes=0;
        int count=0;
        for(int i=0;i<numsSize;++i){
            if(nums[i]==0){
                lengthOfOnes=lengthOfOnes<count?count:lengthOfOnes;
                count=0;
            }else{
                count++;
            }
        }
        lengthOfOnes=lengthOfOnes<count?count:lengthOfOnes;
        return lengthOfOnes;
    }


    /**
     *
     * https://leetcode.com/problems/single-number/
     *
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * 136. Single Number
     * */
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum^nums[i];
        }
        return sum;
    }

    public  int longestSubarrayWithSumK(int []a, long k) {
        int sum=0,longSub=0;
        for(int i=0;i<a.length;++i){
            for(int j=i;j<a.length;++j){
                sum+=a[j];
                if(sum==k){
                    longSub=longSub>(j-i+1)?longSub:(j-i+1);
                }
                else if(sum>k){
                    sum=0;
                    break;
                }
            }
        }
        return longSub;
    }
}
