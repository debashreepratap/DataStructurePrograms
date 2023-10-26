package com.java8practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PallindromeSubstrings {
    public static void main(String[] args) {

        String s= "abbcbba";
        Set<String> set = new LinkedHashSet<>();
        for (int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                if(isPallindrome(s.substring(i,j))){
                    set.add(s.substring(i,j));
                    //System.out.println(s.substring(i,j));
                }
            }
        }
        System.out.println(set);
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

        return true;
    }
}
