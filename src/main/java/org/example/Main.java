package org.example;


import org.example.coding.array.ArrayProblem;
import org.example.coding.string.StringProblem;

public class Main {
    public static void main(String[] args) {

//        StringProblem stringProblem=new StringProblem();
//        String num = "35427";
//        String result=stringProblem.largestOddNumber(num);
//        System.out.println(result);
        ArrayProblem arrayProblem=new ArrayProblem();
        int mat[][]={
                {0,1},
                {1,0}
        };
        int target[][]={
                {1,0},
                {0,1}
        };
        arrayProblem.findRotation(mat,target);
    }
}