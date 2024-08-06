package org.example.coding.recursion;

import java.util.Arrays;
import java.util.List;

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
        if (i == n-1) {
            return true;
        }
        if (arr[i] <= arr[i + 1]) {
            return checkSorted(arr, i + 1, n);
        } else {
            return false;
        }
    }
}
