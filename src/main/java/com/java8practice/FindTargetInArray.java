package com.java8practice;

import java.util.Scanner;

public class FindTargetInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int x = sc.nextInt();
        System.out.println("enter targetted number: ");
        int n = sc.nextInt();
        int[] intArr = new int[x];
        System.out.println("enter "+x+" numbers to the array: ");
        for (int i=0; i<x; i++){
            intArr[i] = sc.nextInt();
        }

        for(int i=0; i<x-1; i++){
            for(int j=i+1; j<x; j++){
                if(intArr[i]== n-intArr[j]){
                    System.out.println("indexes which has the sum of numbers same to target: "+i+" and "+ j);
                }
            }
        }


    }

}
