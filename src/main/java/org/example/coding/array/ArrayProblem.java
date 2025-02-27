package org.example.coding.array;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
     * Remove Duplicates from Sorted Array
     * <p>
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
     */

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
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     * <p>
     * https://leetcode.com/problems/rotate-array/
     */
    public void rotate(int[] nums, int k) {
        int index = nums.length - k;
        nums = reverseArray(nums, 0, index - 1);
        nums = reverseArray(nums, index, nums.length - 1);
        nums = reverseArray(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * reverse array
     */
    public int[] reverseArray(int nums[], int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
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
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] != 0 && nums[j] != 0) {
                i++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
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
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sum1 = nums.length * (nums.length + 1) / 2;
        return sum1 - sum;
    }

    /**
     * https://leetcode.com/problems/max-consecutive-ones/
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     * 485. Max Consecutive Ones
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int numsSize = nums.length;
        int lengthOfOnes = 0;
        int count = 0;
        for (int i = 0; i < numsSize; ++i) {
            if (nums[i] == 0) {
                lengthOfOnes = lengthOfOnes < count ? count : lengthOfOnes;
                count = 0;
            } else {
                count++;
            }
        }
        lengthOfOnes = lengthOfOnes < count ? count : lengthOfOnes;
        return lengthOfOnes;
    }


    /**
     * https://leetcode.com/problems/single-number/
     * <p>
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * <p>
     * 136. Single Number
     */
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }
        return sum;
    }

    public int longestSubarrayWithSumK(int[] a, long k) {
        int sum = 0, longSub = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = i; j < a.length; ++j) {
                sum += a[j];
                if (sum == k) {
                    longSub = longSub > (j - i + 1) ? longSub : (j - i + 1);
                } else if (sum > k) {
                    sum = 0;
                    break;
                }
            }
        }
        return longSub;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int sizeOfMat = mat.length;
        for (int i = 0; i < 4; ++i) {
            boolean flag = true;
            mat = transposeMatrix(mat);
            flag = compareElement(mat, target, flag);
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public boolean compareElement(int[][] mat, int target[][], boolean flag) {
        int sizeOfMatrix = mat.length;
        for (int i = 0; i < sizeOfMatrix; ++i) {
            for (int j = 0; j < sizeOfMatrix; ++j) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return flag;
    }

    public int[][] transposeMatrix(int[][] mat) {
        int sizeOfMatrix = mat.length;
        int newArray[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; ++i) {
            for (int j = 0; j < sizeOfMatrix; ++j) {
                newArray[i][j] = mat[sizeOfMatrix + j - 1][i];
            }
        }
        printResult(newArray);
        return newArray;
    }

    public void printResult(int[][] mat) {
        int sizeOfMatrix = mat.length;
        for (int i = 0; i < sizeOfMatrix; ++i) {
            for (int j = 0; j < sizeOfMatrix; ++j) {
                System.out.println(mat[i][j]);
            }
        }
    }

    public long maximumHappinessSum(int[] happiness, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < happiness.length; i++) {
            list.add(happiness[i]);
        }

        Collections.sort(list);

        long result = 0;
        int i = 0;
        while (i < k) {
            if ((list.getLast() - i) > 0) {
                result += list.removeLast() - i;
                i++;
            } else {
                break;
            }
        }
        return result;
    }

    /*
     * arr={1,2,3,5}  k=3
     *
     * */
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int left = 0, right = 1, mid = 0;
        int n = arr.length;
        int[] res = new int[2];
        while (left < right) {
            mid = left + (right - left) / 2;
            int j = 1, num = 0, den = 0, total = 0;
            double maxFrac = 0;
            for (int i = 0; i < n; ++i) {
                while (j < n && arr[i] >= arr[j] * mid) {
                    j++;
                }
                total += n - j;
                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
                    maxFrac = arr[i] * 1.0 / arr[j];
                    num = i;
                    den = j;
                }
            }
            if (total == k) {
                res[0] = arr[num];
                res[1] = arr[den];
                break;
            }
            if (total > k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return res;
    }

    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (m == 1) {
            for (int j = 0; j < n - 1; j++) {
                if (grid[0][j] != grid[0][j + 1]) {
                    return false;
                }
            }
            return true;
        }

        if (n == 1) {
            for (int i = 0; i < m - 1; i++) {
                if (grid[i][0] != grid[i + 1][0]) {
                    return false;
                }
            }
            return true;
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
                if (grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;

    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        int sizeOfHand = hand.length;
        if (sizeOfHand % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        List<Integer> list = Arrays.stream(hand).boxed().collect(Collectors.toList());
        int totalArray = sizeOfHand / groupSize;
        for (int i = 0; i < totalArray; ++i) {
            Stack<Integer> list1 = new Stack<>();
            for (int j = 0; j < list.size(); ++j) {
                if (list1.size() != groupSize) {
                    if (!list1.contains(list.get(j))) {
                        if ((list.get(j) - list1.peek()) != 1) {
                            return false;
                        }
                        list1.add(list.get(j));
                        list.remove(list.get(j));
                        j--;
                    }
                }
            }
            System.out.println(list1);
        }
        if (list.size() != 0) {
            return false;
        }

        return true;
    }

    /*
     * 974. Subarray Sums Divisible by K
     *
     * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.A subarray is a contiguous part of an array.
     *
     *  Example 1:
     * Input: nums = [4,5,0,-2,-3,1], k = 5
     * Output: 7
     * Explanation: There are 7 subarrays with a sum divisible by k = 5:
     * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
     *
     * */
    public int subarraysDivByK(int[] nums, int k) {

        int i = 0, j = nums.length - 1, result = 0, sum = 0;
        while (i <= j) {
            if (i == j) {
                sum += nums[i];
                if (sum % k == 0) {
                    result += 1;
                }
            } else if (sum < k) {
                sum += nums[i];
                j++;
            }
        }
        return 0;
    }

    public boolean isMatchingPair(char open, char close) {
        switch (open) {
            case '(':
                return close == ')';
            case '{':
                return close == '}';
            case '[':
                return close == ']';
            default:
                return false;
        }
    }

    public boolean processBracker(char c, Stack<Character> stack) {
        switch (c) {
            case '(':
            case '{':
            case '[':
                stack.push(c);
                break;
            default:
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
        }
        return true;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char currentIndexChar = s.charAt(i);
            boolean isProcess = processBracker(currentIndexChar, stack);
            if (!isProcess) {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
