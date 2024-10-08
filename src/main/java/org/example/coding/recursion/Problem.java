package org.example.coding.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Problem {
    public void printNatural(int n, int i) {
        if (i == n) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printNatural(n, i + 1);
        return;
    }

    public void sortArrayUsingRecur(int arr[], int n, int i) {
        if (i == n - 1) {
            return;
        }
        sortArrayUsingRecur(arr, n, i + 1);
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public void sortArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public boolean powerOfFour(int n, int i) {
        int power = (int) Math.pow(4, i);
        if (power == n) {
            return true;
        } else if (power > n) {
            return false;
        } else {
            return powerOfFour(n, i + 1);
        }
    }

    public void generateBinaryString(int n, String str, List<String> result) {
        if (n == 0) {
            result.add(str);
            return;
        }
        if (!str.isEmpty() && str.charAt(str.length() - 1) != '0') {
            generateBinaryString(n - 1, str + "0", result);
        } else if (str.isEmpty()) {
            generateBinaryString(n - 1, str + "0", result);
        }
        generateBinaryString(n - 1, str + "1", result);
    }

    public void printNatural(int n) {
        //base case
        if (n == 0) {
            return;
        }
        //recursive assumption
        printNatural(n - 1);
        //self work
        System.out.print(n + " ");
    }

    public void printPattern(int n) {
        //base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        //recursive assumption
        System.out.print(n + " ");
        printPattern(n - 1);
        //self work
        System.out.print(n + " ");
        return;
    }

    public int consecutiveOnes(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        }

        return consecutiveOnes(n - 1) + consecutiveOnes(n - 2);
    }

    public int powerOf(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        int x = powerOf(a, b / 2);
        if (b % 2 == 0) {
            return x * x;
        } else {
            return a * x * x;
        }
    }

    public void printStarPattern(int n, int i) {
        if (n == 0) {
            return;
        }
        if (i < n) {
            System.out.print("*");
            printStarPattern(n, i + 1);
        } else {
            System.out.println();
            printStarPattern(n - 1, 0);
        }
    }

    public void printStarPattern2(int n, int i) {
        if (n == 0) {
            return;
        }
        if (i >= n) {
            System.out.print("*");
            printStarPattern2(n, i - 1);
        } else {
            System.out.println();
            printStarPattern2(n - 1, 5);
        }
    }

    public void printSubsets(int arr[], int n, int i, String str) {
        if (i == n) {
            System.out.print("[" + str + "]");
            return;
        }
        printSubsets(arr, n, i + 1, str);
        printSubsets(arr, n, i + 1, str + " " + arr[i]);
    }

    public void consecutive(int n, String str) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        if (str.isEmpty() || str.charAt(str.length() - 1) != '1') {
            consecutive(n, str + "1");
        }
        consecutive(n, str + "0");
    }

    public boolean checkSorted(int arr[], int i, int n) {
        if (i == n - 1) {
            return true;
        }
        if (arr[i] <= arr[i + 1]) {
            return checkSorted(arr, i + 1, n);
        } else {
            return false;
        }
    }

    public int findPathStartToEnd(int row, int col, int i, int j, int count, String path) {
        if (i == row || j == col) {
            return count;
        }
        if (i == row - 1 && j == col - 1) {
            System.out.println(path);
            count++;
            return count;
        }
        count = findPathStartToEnd(row, col, i, j + 1, count, path + "R");
        count = findPathStartToEnd(row, col, i + 1, j + 1, count, path + "D1");
        count = findPathStartToEnd(row, col, i + 1, j, count, path + "D");
        return count;
    }

    public int nthcell(int n, int i, int count) {
        if (i == n - 1) {
            count += 1;
            return count;
        }
        if (i >= n) {
            return count;
        }

        count = nthcell(n, i + 1, count);
        count = nthcell(n, i + 2, count);
        count = nthcell(n, i + 3, count);
        count = nthcell(n, i + 4, count);
        count = nthcell(n, i + 5, count);
        count = nthcell(n, i + 6, count);
        return count;
    }

    public void printNTimes(int n, int i, String name) {
        if (i == n) {
            return;
        }
        System.out.println(name);
        printNTimes(n, i + 1, name);
    }

    public void printNaturalInReverse(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNaturalInReverse(n - 1);
    }

    public int sumOfNNumber(int i, int n, int sum) {
        if (i > n) {
            return sum;
        }
        return sumOfNNumber(i + 1, n, sum + i);
    }

    public void reverseAnArray(int arr[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseAnArray(arr, i + 1, j - 1);
    }

    public int sumOfNatural(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumOfNatural(n - 1);
    }

    public int powerOfN(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * powerOf(base, exp - 1);
    }

    public void countNumberOfDigits(int n, int count) {
        if (n == 0) {
            System.out.println(count);
            return;
        }
        count++;
        n /= 10;
        countNumberOfDigits(n, count);
    }

    public boolean checkPalidrome(String str, int i) {
        if (i >= (str.length() - 1 - i)) {
            return true;
        } else if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            return checkPalidrome(str, i + 1);
        } else {
            return false;
        }
    }

    public int findMinElement(int arr[], int n, int i, int min) {
        if (i == n) {
            return min;
        }
        if (arr[i] < min) {
            min = arr[i];
        }
        return findMinElement(arr, n, i + 1, min);
    }

    public boolean checkArrayIsSorted(int arr[], int i, int n) {
        if (n == 1) {
            return true;
        }
        if (i == n - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return checkArrayIsSorted(arr, i + 1, n);
        } else {
            return false;
        }
    }

    public boolean checkValidString(String str, Stack<Character> stack, int i, int n) {
        if (i == n) {
            if (!stack.isEmpty()) {
                return false;
            }
            return true;
        }
        char currentIndexChar = str.charAt(i);
        if (currentIndexChar == '(' || currentIndexChar == '{' || currentIndexChar == '[') {
            stack.push(currentIndexChar);
            return checkValidString(str, stack, i + 1, n);
        } else {
            try {
                char popedChar = stack.pop();
                if (currentIndexChar == ')' && (popedChar == '{' || popedChar == '[')) {
                    return false;
                } else if (currentIndexChar == '}' && (popedChar == '(' || popedChar == '[')) {
                    return false;
                } else if (currentIndexChar == ']' && (popedChar == '(' || popedChar == '{')) {
                    return false;
                }
                return checkValidString(str, stack, i + 1, n);
            } catch (Exception e) {
                return false;
            }
        }
    }

    public void generateString(String str, String result, int i, int n) {
        if (i == n) {
            System.out.println(result);
            return;
        }

        generateString(str, result, i + 1, n);
        generateString(str, result + str.charAt(i), i + 1, n);
    }

    public int maxElement(int arr[], int i, int n, int max) {
        if (i == n) {
            return max;
        }
        max = Math.max(max, arr[i]);
        return maxElement(arr, i + 1, n, max);
    }

    public void printSubsequences(String str, String subsequence, int i, int n) {
        if (i == n) {
            System.out.println(subsequence);
            return;
        }
        printSubsequences(str, subsequence, i + 1, n);
        printSubsequences(str, subsequence + str.charAt(i), i + 1, n);
    }

    public void printSubset(int nums[], int i, int n, String str, List<List<Integer>> result) {
        if (i == n) {
            str = str.trim();
            String x[] = str.isEmpty() ? new String[0] : str.split(" ");
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < x.length; ++j) {
                list.add(Integer.valueOf(x[j]));
            }
            result.add(list);
            return;
        }
        printSubset(nums, i + 1, n, str, result); // Exclude nums[i]
        printSubset(nums, i + 1, n, str + nums[i] + " ", result); // Include nums[i]
    }

    public void printN(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printN(n - 1);
        System.out.println();
        System.out.print(n);
    }

    public void sortArray(int arr[], int i) {
        if (arr.length - 1 == i) {
            return;
        }
        sortArray(arr, i + 1);
        int j = i + 1, temp = arr[i];
        while (j < arr.length) {
            if (temp > arr[j]) {
                arr[j - 1] = arr[j];
                arr[j] = temp;
                break;
            }
            j++;
        }
    }

    public void sortStack(Stack<Integer> stack, int size, List<Integer> list) {
        if (stack.isEmpty()) {
            System.out.println(list);
            return;
        }
        int peekValue = stack.pop();
        if (list.isEmpty()) {
            list.add(peekValue);
        } else {
            insertInt(list, peekValue, 0);
        }
        sortStack(stack, size, list);
    }

    public void insertInt(List<Integer> list, int peekValue, int i) {
        if (list.isEmpty() || list.size() == i) {
            list.add(peekValue);
            return;
        }
        if (list.get(i) > peekValue) {
            list.add(i, peekValue);
            return;
        }
        insertInt(list, peekValue, i + 1);
    }

    public void deleteMiddleElementFromStack(Stack<Integer> stack, int k) {
        if (stack.isEmpty()) {
            return;
        }
        if (k == 1) {
            stack.pop();
            return;
        }
        int topElement = stack.pop();
        deleteMiddleElementFromStack(stack, k - 1);
        stack.push(topElement);
    }

    public void reverseStackImpl(Stack<Integer> stack, int elem) {
        if (stack.isEmpty()) {
            stack.push(elem);
            return;
        }
        int x = stack.pop();
        reverseStackImpl(stack, elem);
        stack.push(x);
    }

    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int x = stack.pop();
        reverseStack(stack);
        reverseStackImpl(stack, x);
    }
}
