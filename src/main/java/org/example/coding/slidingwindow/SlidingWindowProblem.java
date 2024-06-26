package org.example.coding.slidingwindow;

import java.util.*;

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
                result[i] = sum;
            } else if (k < 0) {
                int x = Math.abs((i + size - 1)) % size;
                int c = 0;
                int sum = 0;
                while (c < Math.abs(k)) {
                    sum += code[x];
                    x = Math.abs((x - 1)) % size;
                    c++;
                }
                result[i] = sum;
            } else {
                result[i] = 0;
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

    public int maximumLengthSubstring(String s) {
        int i = 0, j = 0, lengthOfS = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int substringLength = 0;
        while (i < lengthOfS) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 1) {
                while (map.get(s.charAt(i)) > 1) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                    j++;
                }
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                if (substringLength < (i - j + 1)) {
                    substringLength = (i - j + 1);
                }
            } else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            i++;
        }
        i--;
        if (substringLength < (i - j + 1)) {
            substringLength = (i - j + 1);
        }
        System.out.println(substringLength + " ");
        return 10;
    }

    public void findFirstNegInWindow(int arr[], int k) {
        //brute force approach
//        List<Integer>result=new ArrayList<>();
//        int size=arr.length,windowCount=size-k+1;
//
//        for(int i=0;i<windowCount;++i){
//            int startIndx=i,endIndx=i+k-1;
//            while (startIndx<=endIndx){
//                if(arr[startIndx]<0){
//                    result.add(arr[startIndx]);
//                    break;
//                }
//                startIndx++;
//            }
//            if(startIndx>endIndx){
//                result.add(0);
//            }
//        }
//        System.out.println(result);

//        optimize approach

        List<Integer> result = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        int size = arr.length;
        int j = 0, i = 0;
        while (j < size) {
            if (arr[j] < 0) {
                negList.add(arr[j]);
            }
            if ((j - i + 1) < k) {
                j++;
            } else {
                if (arr[i] < 0) {
                    int current = negList.remove(0);
                    result.add(current);
                } else {
                    int current = negList.stream().findFirst().orElse(0);
                    result.add(current);
                }
                i++;
                j++;
            }
        }
        int[] array = result.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }

    public boolean isMapEqual(Map<Character, Integer> anagram, Map<Character, Integer> mSizeCharacter) {
        if (anagram.size() != mSizeCharacter.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : anagram.entrySet()) {
            if (mSizeCharacter.containsKey(entry.getKey())) {
                int value = entry.getValue();
                int value2 = mSizeCharacter.get(entry.getKey());
                if (value != value2) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();

        Map<Character, Integer> anagram = new HashMap<>();
        for (int i = 0; i < ptr.length(); ++i) {
            anagram.put(ptr.charAt(i), anagram.getOrDefault(ptr.charAt(i), 0) + 1);
        }

        Map<Character, Integer> mSizeCharacter = new HashMap<>();

        int i = 0, j = 0, count = 0;
        while (j < n) {
            Character current = str.charAt(j);
            mSizeCharacter.put(current, mSizeCharacter.getOrDefault(current, 0) + 1);
            if (j - i + 1 < m) {
                j++;
            } else {
                boolean mapEqual = isMapEqual(anagram, mSizeCharacter);
                if (mapEqual) {
                    count++;
                    result.add(i);
                }
                if (mSizeCharacter.get(str.charAt(i)) == 1) {
                    mSizeCharacter.remove(str.charAt(i));
                } else {
                    mSizeCharacter.put(str.charAt(i), mSizeCharacter.getOrDefault(str.charAt(i), 0) - 1);
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
