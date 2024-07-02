package org.example.coding.dailyquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {
    public boolean threeConsecutiveOdds(int[] arr) {
        int k=3,i=0,j=0;
        while (j<arr.length){
            if((j-i+1)<k){
                j++;
            }else{
                boolean flag=true;
                for(int x=i;x<=j;++x){
                    if(arr[x]%2==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                   return true;
                }
                i++;
                j++;
            }
        }
        return  false;
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        //always consider num1 is greater
        if(nums1.length<nums2.length){
            int temp[]=nums1;
            nums1=nums2;
            nums2=temp;
        }

        int sizeOfNums1=nums1.length;
        int sizeOfNums2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer>list=new ArrayList<>();
        int i=0,j=0;
        while (i<sizeOfNums1&&j<sizeOfNums2){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]!=nums2[j] && nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]!=nums2[j] && nums2[j]<nums1[i]){
                j++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
