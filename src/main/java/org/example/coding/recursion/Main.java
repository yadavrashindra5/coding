package org.example.coding.recursion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();
        String str = "()";
//        System.out.println(problem.validParenthesis(str, 0, 0));
        problem.generateValidateParenthesis(3, 0, 0, "");
    }
}
