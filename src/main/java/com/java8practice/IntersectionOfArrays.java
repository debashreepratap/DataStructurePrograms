package com.java8practice;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int [] arr1 = new int[] {1,4,3,6,2,8};
        int [] arr2 = new int[] {9,4,1,3,5,6};
        Set s1 = new HashSet();
        for (int i: arr1){
           s1.add(i);
        }
        Set s2 = new HashSet();
        for (int i: arr2){
            if(s1.contains(i)){
                s2.add(i);
            }
        }
        System.out.println("Intersected result: "+s2);
    }
}
