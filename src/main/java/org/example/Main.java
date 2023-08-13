package org.example;

import org.example.coding.array.DuplicateNumber;
import org.example.coding.array.Occurrence;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DuplicateNumber duplicateNumber=new DuplicateNumber();
        int arr[]={1,2,3,4};
        duplicateNumber.findDuplicate(arr);
    }
}