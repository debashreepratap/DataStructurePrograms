package com.java8practice;

public class PutZeroToEnd {

    public static void main(String[] args) {
        int [] arr = new int[]{1,6,0,3,2,0,0,7,0};
        for (int i = 0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        char c1= 'a';
       // char c2= char(c1+1);
        String [] s = {"x","y"};
        System.out.println(s[1]);

    }
}
