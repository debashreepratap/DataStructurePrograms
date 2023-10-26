package com.java8practice;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class LargestPallindromeInAString {

    public static void main(String[] args) {
        String s= "cuttuack";
        List<String> list = new ArrayList<>();
        for(int i=0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                //System.out.println(s.substring(i,j));
                if(isPallindrome(s.substring(i,j))){
                    list.add(s.substring(i,j));
                }
            }
        }
        System.out.println(list.stream().max(comparing(String::length)).get());
    }
    public static boolean isPallindrome(String s){


        int i=0;
        int j=s.length()-1;
        while(j>i){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true;
    }

}
