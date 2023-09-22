package com.java8practice;

import java.util.ArrayList;
import java.util.List;

public class GetKElemetsInSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,5,8,10,13,17,19,25,27,32};
        int x=19;
        int k=4;
        int n=0;
        for (int i=0;i<arr.length;i++){

            if(arr[i]== x){
                n=i;
            }
        }
        System.out.println(n);
        List<Integer> result = new ArrayList<>();
        int p = n-1;
        int q = n+1;
        for(int i=1; i<=k; i++){
            if(arr[n]-arr[p] < arr[q]-arr[n]){
                result.add(arr[p]);
                p = p-1;
            }else if(arr[n]-arr[p] == arr[q]-arr[n]){

                result.add(arr[p]);
                p=p-1;

            }else{
                result.add(arr[q]);
                q = q+1;
            }


        }
        System.out.println(result);
    }
}
