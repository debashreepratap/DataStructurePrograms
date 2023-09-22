package com.interview;

import java.util.ArrayList;
import java.util.List;

public class FlattenNestedObjectArray {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Object[] objArr= {1,2,new Object[]{4,5, new Object[]{6,7},8},9,10};
        Integer[] output = flatten(objArr);
        for (Integer i:output){
            System.out.println(i);
        }
    }
    public static Integer[] flatten(Object[] objArr){

        for(Object obj: objArr){
            if(obj instanceof Integer){
                list.add((Integer) obj);
            }else{
                flatten((Object[])obj);
            }
        }
        return  list.toArray(new Integer[0]);
    }
}
