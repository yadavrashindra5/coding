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

    public int[] sortedSquares(int[] nums) {
//        Approach 1
//        for (int i = 0; i < nums.length; ++i) {
//            nums[i] = nums[i] * nums[i];
//        }
//        int size = nums.length;
//        int i = 0, j = size - 1;
//        while (i < j) {
//            if (nums[i] > nums[j]) {
//                int temp=nums[i];
//                nums[i]=nums[j];
//                nums[j]=temp;
//            }else{
//                j--;
//            }
//        }
//        return nums;

//        Approach 2

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            nums[i] = nums[i] * nums[i];
        }
        int answer[] = new int[n];
        int k = n - 1;
        int i = 0, j = n - 1;
        while (i < j) {
            if (nums[i] < nums[j]) {
                nums[k] = nums[j];
                j--;
            } else {
                nums[k] = nums[i];
                i++;
            }
            k++;
        }
        return nums;
    }

    public int[] shortestToChar(String s, char c) {
//        approach 1
   /*     int n = s.length();
        if (n == 1) {
            return new int[]{0};
        }
        int i = 0, j = 1, k = j;
        int answer[] = new int[n];
        while (j < n) {
            if (s.charAt(j) != c) {
                while (s.charAt(j) != c) {
                    j++;
                }
            } else {
                if (s.charAt(k) == c) {
                    answer[i] = Math.abs(i - k) < Math.abs(i - j) ? Math.abs(i - k) : Math.abs(i - j);
                } else {
                    answer[i] = Math.abs(i - j);
                }
                if (i == j) {
                    k = j;
                    j++;
                }
                i++;
            }
        }
        return answer;
    */
        int n = s.length();
        if (n == 1) {
            return new int[]{0};
        }
        int answer[] = new int[n];
        int i = 0, j = 0, k = j;
        while (j < n) {
            if (s.charAt(j) != c) {
                j++;
            } else {
                if (s.charAt(k) == c) {
                    answer[i] = Math.abs(i - k) < Math.abs(i - j) ? Math.abs(i - k) : Math.abs(i - j);
                } else {
                    answer[i] = Math.abs(i - j);
                }
                if (i == j) {
                    k = j;
                    j++;
                }
                i++;
            }
        }
        return answer;
    }

    public String reverseOnlyLetters(String s) {
        StringBuilder builder = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetter(builder.charAt(i))) {
                i++;
            } else if (!Character.isLetter(builder.charAt(j))) {
                j--;
            } else {
                char x = s.charAt(i);
                builder.setCharAt(i, builder.charAt(j));
                builder.setCharAt(j, x);
                i++;
                j--;
            }
        }
        return builder.toString();
    }

}
