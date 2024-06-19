package org.example.coding.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindowProblem {
    public void maximumSum(int arr[], int k) {
        int i = 0, j = 0, sum = 0, sizeOfArr = arr.length, max = Integer.MIN_VALUE;
        while (j < sizeOfArr) {
            sum += arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max);
    }

    public int[] decrypt(int[] code, int k) {

        int result[] = new int[code.length];

        int size = code.length;
        for (int i = 0; i < code.length; ++i) {
            if (k > 0) {
                int x = (i + 1) % size;
                int c = 0;
                int sum = 0;
                while (c < Math.abs(k)) {
                    sum += code[x];
                    x = (x + 1) % size;
                    c++;
                }
                result[i]=sum;
            } else if (k < 0) {
                int x = Math.abs((i+size - 1)) % size;
                int c = 0;
                int sum = 0;
                while (c < Math.abs(k)) {
                    sum += code[x];
                    x = Math.abs((x - 1)) % size;
                    c++;
                }
                result[i]=sum;
            } else {
                result[i]=0;
            }
        }
        return result;
    }

    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, size = s.length(), count = 0;
        while (j < size) {
            Character currentChar = s.charAt(j);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            if (j - i + 1 < 3) {
                j++;
            } else {
                if (map.size() == 3) {
                    count++;
                }
                j++;
                if (map.get(s.charAt(i)) == 1) {
                    map.remove(s.charAt(i));
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                }
                i++;
            }
        }
        System.out.println(count);
        return 0;
    }
}
