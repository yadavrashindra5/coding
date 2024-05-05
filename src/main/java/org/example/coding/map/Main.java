package org.example.coding.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LeetCode leetCode=new LeetCode();
        int people[]={3,2,2,1};
        int limit=3;
//        System.out.println(leetCode.numRescueBoats(people,limit));
        int arr[]={1,2};
        Arrays.sort(arr);
        int i=0,j=arr.length-1,count=0;
        while (i<j){
            if(arr[j]==limit){
                count++;
                j--;
            }else if((arr[i]+arr[j])<=limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        if(i==j){
            count++;
        }
        System.out.println(count);
    }
}
