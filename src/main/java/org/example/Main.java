package org.example;


import org.example.coding.string.StringProblem;

public class Main {
    public static void main(String[] args) {

        StringProblem stringProblem=new StringProblem();
        String s = "the sky is blue";
        String result=stringProblem.reverseWords(s);
        System.out.println(result);
    }
}