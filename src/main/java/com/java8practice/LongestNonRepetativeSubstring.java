package com.java8practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestNonRepetativeSubstring {
    public static void main(String[] args) {
        String s= "accolite";
        System.out.println(getNonRepetativeSubString(s));
    }

    private static String getNonRepetativeSubString(String s) {
        StringBuilder sb;
        List<String> list = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            sb = new StringBuilder(s.charAt(i)) ;
            for (int j=i+1; j<s.length(); j++){
                if(!sb.toString().contains(Character.toString(s.charAt(j)))){
                    sb.append(s.charAt(j));
                }else {
                    break;
                }
            }
            list.add(sb.toString());
        }
        String max = Collections.max(list, Comparator.comparing(String::length));
        return max;
    }
}
