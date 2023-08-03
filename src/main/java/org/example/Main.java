package org.example;

import org.example.coding.array.Occurrence;

public class Main {
    public static void main(String[] args) {
        Occurrence object=new Occurrence();
        int arr[]={1, 1, 2, 2, 2, 2, 3};
        int x=2;
        System.out.println(object.numberOfOccurence(arr,2));
    }
}