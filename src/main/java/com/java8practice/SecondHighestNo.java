package com.java8practice;

import java.util.Arrays;

public class SecondHighestNo {
    public static void main(String[] args) {
        int[] arr ={1,3,9,4,6,7};
        //Arrays.sort(arr);
        //System.out.println(arr[arr.length-1]);
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+",");
        }

        //System.out.println(arr[arr.length-2]);
    }
}
