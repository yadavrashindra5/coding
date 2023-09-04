package org.example.coding.array;

/*
*
*
* Longest Subarray with given Sum K(Positives)
*arr []={1,2,3,1,1,1,1,4,2,3}
*
*
* */

import java.util.Arrays;
import java.util.HashMap;

public class LogestSubarrayK {

    public void logestSubarrayK(){
        int leng=0,k=3;
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;++i){
            sum+=arr[i];
            if(sum==k){
                leng=i+1;
            }
            else if(map.containsKey(sum-k)){
                leng=Math.max(leng,i-map.get(sum-k));
            }
            map.put(sum,i);
        }
        System.out.println(leng);
    }
}
