package org.example.coding.map;

import java.util.HashMap;

public class LeetCode {
    public int numRescueBoats(int[] people, int limit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, numberOfPeople = people.length;
        int numberOfBoats = 0;
        while (i < numberOfPeople) {
            int weightOfCurrentPerson = people[i];
            int limitWeightDiff = limit - weightOfCurrentPerson;
            if(limitWeightDiff==0){
                numberOfBoats++;
                i++;
                continue;
            }
            if (map.containsKey(limitWeightDiff)) {
                numberOfBoats++;
                map.remove(limitWeightDiff);
            } else {
                boolean flag = true;
                while (flag&&limitWeightDiff >= 1) {
                    if (map.containsKey(limitWeightDiff)) {
                        numberOfBoats++;
                        map.remove(limitWeightDiff);
                        flag=false;
                    }
                    limitWeightDiff-=1;
                }
                if(flag){
                    map.put(weightOfCurrentPerson,i);
                }
            }
            i++;
        }
        System.out.println(map);
        return numberOfBoats;
    }
}
