package org.example.coding.dailyquestion;

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
}
