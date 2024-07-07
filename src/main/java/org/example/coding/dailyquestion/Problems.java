package org.example.coding.dailyquestion;

import java.util.*;

public class Problems {
    public boolean threeConsecutiveOdds(int[] arr) {
        int k = 3, i = 0, j = 0;
        while (j < arr.length) {
            if ((j - i + 1) < k) {
                j++;
            } else {
                boolean flag = true;
                for (int x = i; x <= j; ++x) {
                    if (arr[x] % 2 == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
                i++;
                j++;
            }
        }
        return false;
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new TreeMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < nums2.length; ++i) {
            int currentIndexValue=nums2[i];
            if (map1.containsKey(currentIndexValue) && map1.get(currentIndexValue) != 0) {
                list.add(currentIndexValue);
                map1.put(currentIndexValue, map1.get(currentIndexValue) - 1);
            }
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();++i){
            result[i]=list.get(i);
        }
        return result;
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return totalBottles;
    }
}
