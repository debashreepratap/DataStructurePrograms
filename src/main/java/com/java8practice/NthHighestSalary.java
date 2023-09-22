package com.java8practice;

import java.util.*;

public class NthHighestSalary {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("micael",1500);
        map.put("anil",1000);
        map.put("ankit",1200);
        map.put("bhavna",1300);
        map.put("james",1400);
        map.put("tom",1500);
        map.put("daniel",1700);
        System.out.println(getNthHighestEmployee(map, 2));


    }
    private static Map.Entry<String,Integer> getNthHighestEmployee(Map<String,Integer> map, int n){

        Set <Map.Entry<String, Integer>> set = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,
                        Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

       return list.get(n);
    }
}
