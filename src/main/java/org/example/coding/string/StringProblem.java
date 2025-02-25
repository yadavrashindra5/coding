package org.example.coding.string;

import java.util.Arrays;

public class StringProblem {

    /*
     *https://leetcode.com/problems/remove-outermost-parentheses/
     *1021. Remove Outermost Parentheses
     *
     * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
     *
     * */
    public String removeOuterParentheses(String s) {
        int count = 0;
        int sizeOfS = s.length();
        String result = "";
        for (int i = 0; i < sizeOfS; ++i) {
            if (s.charAt(i) == '(') {
                if (count >= 1) {
                    result += s.charAt(i);
                }
                count++;
            } else {
                if (count > 1) {
                    result += s.charAt(i);
                }
                count--;
            }
        }
        return result;
    }


    /*
     *
     * https://leetcode.com/problems/reverse-words-in-a-string/
     *
     * 151. Reverse Words in a String
     *
     * Given an input string s, reverse the order of the words.
     * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     *
     * */
    public String reverseWords(String s) {
        String trim = s.trim();
        String splitString[] = trim.split(" ");
        int splitSize = splitString.length - 1;
        String result = "";
        for (int i = splitSize; i >= 0; --i) {
            if (!splitString[i].isEmpty()) {
                result += splitString[i].trim() + " ";
            }
        }
        return result.trim();
    }

    /*
     * https://leetcode.com/problems/largest-odd-number-in-string/
     *
     * 1903. Largest Odd Number in String
     *
     * */
    public String largestOddNumber(String str) {
        int sizeOfString = str.length() - 1;
        for (int i = sizeOfString; i >= 0; --i) {
            char lastCharacter = str.charAt(i);
            int isOddOrEven = Character.getNumericValue(lastCharacter);
            if (isOddOrEven % 2 != 0) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }

    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int lengthOfV1 = v1.length, lengthOfV2 = v2.length, i = 0, j = 0;
        while (i < lengthOfV1 && j < lengthOfV2) {
            if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) {
                return -1;
            } else if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) {
                return 1;
            }
            i++;
            j++;
        }
        while (i < lengthOfV1) {
            if (Integer.valueOf(v1[i]) > 0) {
                return 1;
            }
            i++;
        }
        while (j < lengthOfV2) {
            if (Integer.valueOf(v2[j]) > 0) {
                return -1;
            }
            j++;
        }
        return 0;
    }


    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            int absDifference = Math.abs((s.charAt(i) - s.charAt(i + 1)));
            sum += absDifference;
        }
        return sum;
    }

    /*
     * https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box
     * solve this problem using cummulative approach
     * */

    public int[] minOperations(String boxes) {
        int leftCummulative[] = new int[boxes.length()];
        int rightCummulative[] = new int[boxes.length()];

        int left = 0, right = 0;
        for (int i = 0; i < boxes.length(); ++i) {
            left += Character.getNumericValue(boxes.charAt(i));
            leftCummulative[i] = left;
        }

        for (int i = boxes.length() - 1; i >= 0; --i) {
            right += Character.getNumericValue(boxes.charAt(i));
            rightCummulative[i] = right;
        }

        int prefixsum = 0, suffix = 0;
        for (int i = 0; i < rightCummulative.length; ++i) {
            suffix += rightCummulative[i];
        }

        int result[] = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); ++i) {
            result[i] = prefixsum + suffix - rightCummulative[i];
            prefixsum += leftCummulative[i];
            suffix -= rightCummulative[i];
        }
        return result;
    }

    public int finalValueAfterOperations(String[] operations) {
        int valueAfterOperations = 0;
        for (int i = 0; i < operations.length; ++i) {
            String value = operations[i];
            switch (value) {
                case "++X":
                    valueAfterOperations += 1;
                    break;
                case "X++":
                    valueAfterOperations += 1;
                    break;
                case "--X":
                    valueAfterOperations -= 1;
                    break;
                case "X--":
                    valueAfterOperations -= 1;
                    break;
            }
        }
        return valueAfterOperations;
    }

    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }

    public String convertDateToBinary(String date) {
        String splitDate[] = date.split("\\-");
        for (int i = 0; i < splitDate.length; ++i) {
            splitDate[i] = Integer.toBinaryString(Integer.valueOf(splitDate[i]));
        }

        String result = String.join("-", splitDate);
        return result;
    }
}