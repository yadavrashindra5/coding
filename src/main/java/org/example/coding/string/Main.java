package org.example.coding.string;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        int score[]={100,11,111111};
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<score.length;++i){
            map.put(score[i],i);
        }

        Set<Integer>set=map.keySet();
        List<Integer>list=new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        String result[]=new String[map.size()];
        for(int i=0;i<list.size();++i){
            int value=list.get(i);
            int index=map.get(value);
            if(i==0){
                result[index]="Gold Medal";
            }else if(i==1){
                result[index]="Silver Medal";
            }else if(i==2){
                result[index]="Bronze Medal";
            }else{
                result[index]=String.valueOf(i+1);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
