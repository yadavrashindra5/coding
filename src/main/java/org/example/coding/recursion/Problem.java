package org.example.coding.recursion;

import org.example.coding.node.Node;

import java.lang.reflect.Array;
import java.util.*;
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

    public void reverseAnArray(int arr[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseAnArray(arr, i + 1, j - 1);
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

    public String generateString(String str, String result, int i, int k) {
        if (i == str.length()) {
            str += result;
            return str;
        }
        if ((int) str.charAt(i) == 122) {
            result += "a";
        }
        result += String.valueOf((char) ((int) str.charAt(i) + 1));
        str = generateString(str, result, i + 1, k);
        if (str.length() < k) {
            str = generateString(str, "", 0, k);
        }
        return str;
    }

    public int printFactorial(int n) {
        //base case
        if (n == 1 || n == 0) {
            return n;
        }
        //recursive intuation || recursive case
        int x = printFactorial(n - 1);
        //self work
        return x * n;
    }

    public int fibonacciSequence(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
    }

    public int powerOfNumber(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * powerOfNumber(a, b - 1);
    }

    public void printN(int n) {
        if (n == 0) {
            return;
        }
        printN(n - 1);
        System.out.print(n + " ");
    }

    public String reverseString(String str, int i, String result) {
        if (str.length() == i) {
            return result;
        }
        result = String.valueOf(str.charAt(i)) + result;
        return reverseString(str, i + 1, result);
    }

    public boolean checkPalidrome(String str, int i, int j) {
        if (i >= j) {
            return true;
        } else if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return checkPalidrome(str, i + 1, j - 1);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int temp = a;
        a = b;
        b = temp % b;
        return gcd(a, b);
    }

    public int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int mod = num % 10;
        return mod + sumOfDigits(num / 10);
    }

    public int occurrenceOfCharacter(String str, char ch, int i) {
        if (i == str.length()) {
            return 0;
        }
        int count = (str.charAt(i) == ch) ? 1 : 0;
        return count + occurrenceOfCharacter(str, ch, i + 1);
    }

    public int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return recursiveBinarySearch(arr, key, low, mid - 1);
        } else {
            return recursiveBinarySearch(arr, key, mid + 1, high);
        }
    }


    /**
     * Reverse number int.
     *
     * @param num the num
     * @param rev the rev
     * @return the int
     */
    public int reverseNumber(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverseNumber(num / 10, (rev * 10) + (num % 10));
    }

    public boolean isPalindrome(int num) {
        if (num == 0) {
            return false;
        }
        return num == reverseNumber(num, 0);
    }

    public int findMaxElement(int arr[], int max, int i) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return findMaxElement(arr, max, i + 1);
    }

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /*
     * https://www.geeksforgeeks.org/problems/number-of-paths0926/1
     * */
    public int numberOfPaths1(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfPaths1(m - 1, n) + numberOfPaths1(m, n - 1);
    }

    /*
     * https://www.geeksforgeeks.org/problems/number-of-paths0926/1
     * */
    public int numberOfPaths2(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i == m || j == n) {
            return 0;
        }
        return numberOfPaths2(m, n, i + 1, j) + numberOfPaths2(m, n, i, j + 1);
    }

    /*
     * https://leetcode.com/problems/remove-linked-list-elements/description
     * */
    public <T> Node<T> removeElements(Node<T> head, T val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        if (head.data == val) {
            return head.next;
        } else {
            return head;
        }
    }

    /*
     * https://leetcode.com/problems/pascals-triangle/description/
     * */
    public ArrayList<Integer> printPascal(int n, ArrayList<ArrayList<Integer>> result) {
        if (n == 1) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
            return list;
        }
        ArrayList<Integer> prevRow = printPascal(n - 1, result);
        ArrayList<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        for (int i = 1; i < prevRow.size(); ++i) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        currentRow.add(1);
        result.add(currentRow);
        return currentRow;
    }

    /*
     * https://www.naukri.com/code360/problems/magic-index_1199229
     * */
    public int magicIndex(ArrayList<Integer> list, int n, int i) {
        if (i == n) {
            return -1;
        }
        if (list.get(i) == i) {
            return i;
        }
        return magicIndex(list, n, i + 1);
    }

    public int sumOfList(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public void generateSubset(int nums[], int i, int n, ArrayList<Integer> currentSubset, ArrayList<Integer> result) {
        if (i == n) {
            result.add(sumOfList(currentSubset));
            return;
        }

        currentSubset.add(nums[i]);
        generateSubset(nums, i + 1, n, currentSubset, result);
        currentSubset.remove(currentSubset.size() - 1);
        generateSubset(nums, i + 1, n, currentSubset, result);
    }

    /*
     * https://www.naukri.com/code360/problems/subset-sum_3843086
     * */
    public ArrayList<Integer> subsetSum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        generateSubset(nums, 0, nums.length, new ArrayList<>(), result);
        Collections.sort(result); // Sort the result if needed
        return result;
    }

    /*
     * https://www.naukri.com/code360/problems/encode-the-message_699836
     * */
    public void encodeHelper(String message, int index, StringBuilder result) {
        int n = message.length();

        // Base case: if index reaches the end of the string, we're done
        if (index >= n) {
            return;
        }

        // Get the current character and initialize count
        char currentChar = message.charAt(index);
        int count = 0;

        // Count consecutive occurrences of currentChar starting from index
        while (index < n && message.charAt(index) == currentChar) {
            count++;
            index++;
        }

        // Append currentChar and its count to result
        result.append(currentChar).append(count);

        // Recursive call to process the rest of the string
        encodeHelper(message, index, result);
    }

    public void prints(int n, int k, List<Integer> result) {
        if (n == 0 || n < 0) {
            result.add(n);
            return;
        }
        result.add(n);
        prints(n - k, k, result);
        result.add(n);
    }

    /*
     *
     * */
    public List<Integer> printSeries(int n, int k) {
        List<Integer> list = new ArrayList<>();
        prints(n, k, list);
        return list;
    }

    /*
     *https://www.naukri.com/code360/problems/remove-duplicates-recursively_5849
     * */
    public static String removeConsecutiveDuplicates(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String result = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public String removeString(String s, int i, String result) {
        // Base case: if we reach the end of the string, return the result
        if (i == s.length()) {
            return result;
        }

        // Append the current character only if it's the start or different from the previous character
        if (result.isEmpty() || result.charAt(result.length() - 1) != s.charAt(i)) {
            result += s.charAt(i);
        }

        // Recursive call with the next index
        return removeString(s, i + 1, result);
    }

    public void insertIntoStack(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        if (stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int popElement = stack.pop();
        insertIntoStack(stack, element);
        stack.push(popElement);
    }

    public void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int popElement = stack.pop();
        sortStack(stack);
        insertIntoStack(stack, popElement);
    }

    public int recursiveSubset(int arr[], int i, int n, int target) {
        if (target == 0) {
            return 1;
        }
        if (i == n || target < 0) {
            return 0;
        }
        int include = recursiveSubset(arr, i + 1, n, target - arr[i]);
        int exclude = recursiveSubset(arr, i + 1, n, target);
        return include + exclude;
    }

    public int findWays(int arr[], int target) {
        return recursiveSubset(arr, 0, arr.length, target) % 1000000007;
    }
}
