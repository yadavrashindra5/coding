package org.example.coding.array;

//Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
/**
 *
 * N=7, x=2
 * Arr[] = {1, 1, 2, 2, 2, 2, 3}
 *
 * second approach:-
 * we use binary search to find the index of first position element and last position of element and at last we subtract
 * and add 1 to the result
 *
 * first_index=2
 * last_index=5
 * result=last_index-first_index+1
 *
 *
 *
 * */
public class Occurrence {

    public int leftIndexBinarySearch(int array[],int x){
        int low=0,high=array.length-1,result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==x){
                result=mid;
                high=mid-1;
            }
            else if(array[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public int rightIndexBinarySearch(int array[],int x){
        int low=0,high=array.length-1,result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==x){
                result=mid;
                low=mid+1;
            }
            else if(array[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    //x is basically we have to find in the array
    public int numberOfOccurence(int array[],int x){
        return rightIndexBinarySearch(array,x)-leftIndexBinarySearch(array,x)+1;
    }
}
