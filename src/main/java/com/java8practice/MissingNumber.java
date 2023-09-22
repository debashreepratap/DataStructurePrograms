package com.java8practice;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int [] numArray = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10};
        int sum = Arrays.stream(numArray).sum();
        System.out.println(sum);
        int n = numArray.length +1;
        int sumofNElements  = (n*(n+1))/2;

        System.out.println("Missing number is :"+ (sumofNElements - sum));


    }
}
