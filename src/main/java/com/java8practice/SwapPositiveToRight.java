package com.java8practice;

public class SwapPositiveToRight {
    public static void main(String[] args) {
        int arr[] ={-5, 1, 6, -4, 3, -2};
        int j=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

