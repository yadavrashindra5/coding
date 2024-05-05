package org.example.coding.string;

public class Main {
    public static void main(String[] args) {
        StringProblem stringProblem=new StringProblem();
        String version1="001.0.0.0",version2="1.0.0";
        System.out.println(stringProblem.compareVersion(version1,version2));
    }
}
