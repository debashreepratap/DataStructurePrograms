package com.java8practice;



public class LargestPallindrom {

    public static void main(String[] args) {

        System.out.println(longestPallindrome("abcba"));
    }
    private static  String longestPallindrome(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){

            for (int j=s.length()-1-i; j>=0; j--){
                System.out.println(s.charAt(i)+"   "+s.charAt(j));
                if(s.charAt(i) == s.charAt(j)){
                    sb.append(s.charAt(i));
                    System.out.println(sb);
                    break;
                }

            }
        }
        return  sb.toString();
    }
}
