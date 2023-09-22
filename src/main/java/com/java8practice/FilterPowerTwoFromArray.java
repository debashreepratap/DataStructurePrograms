package com.java8practice;

import java.util.ArrayList;
import java.util.List;

public class FilterPowerTwoFromArray {

    public static void main(String[] args) {
        int[] intArr = new int[]{2,5,4,32,76,64};
        List list = new ArrayList();
        for (int i : intArr){
            int x = i;
            while(i/2 >= 1){
                if (i%2 ==0 && i/2==1) {
                    list.add(x);
                    break;
                } else if(i%2==1){
                   break;
                } else
                    i=i/2;
            }
        }

        System.out.println(list);
    }
}
