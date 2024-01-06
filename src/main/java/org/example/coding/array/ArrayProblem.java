package org.example.coding.array;

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
     *
     * */
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
     *
     * */
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
}
