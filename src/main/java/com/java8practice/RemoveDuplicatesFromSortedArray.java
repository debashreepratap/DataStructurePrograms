package com.java8practice;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] intArr = new int[]{1,1,2,3,3,4,5,5,5,6,6,7,8};
        int uniqueCount = 1;
        for (int i=1; i<intArr.length; i++){
            if(intArr[i] !=intArr[i-1]){
                intArr[uniqueCount] =intArr[i];
                uniqueCount++;
            }
        }
        for (int i=0; i<uniqueCount; i++){
            System.out.println(intArr[i]);
        }
    }
}
