package org.example.coding.string;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        StringProblem stringProblem = new StringProblem();
        String str = "001011";
        int result[] = stringProblem.minOperations(str);
        System.out.println(Arrays.toString(result));
    }
}
