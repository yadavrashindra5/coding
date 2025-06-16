package org.example.coding.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringProblem stringProblem = new StringProblem();
        char chars[] = {'a', 'a', 'b', 'b'};
        int lengthOfCompressString = stringProblem.compress(chars);
        System.out.println(lengthOfCompressString);
    }
}
