package com.java8practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfLetters {
    public static void main(String[] args) {
        String str = "hello there";
        char[] ch = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i =0; i<ch.length; i++){
            int count = 1;
            if(charMap.containsKey(ch[i])){
                charMap.put(ch[i], charMap.get(ch[i])+1);
            }
            else
                charMap.put(ch[i], count);
        }
        System.out.println(charMap);
    }
}
