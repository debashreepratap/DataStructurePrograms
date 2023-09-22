package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayWithGivenSize {
    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        int splitSize =3;
        List<int[]> outputArrList = getSplitArrays(intArray, splitSize);
        outputArrList.forEach(ints -> {
                System.out.println(Arrays.toString(ints));

        });

    }

    private static List<int[]> getSplitArrays(int[] intArray, int splitSize) {
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<intArray.length;i=i+splitSize)
        {
            int[] subArr = new int[splitSize];
            for(int k=0,j=i; k< splitSize && j<intArray.length; j++){
                subArr[k] =intArray[j];
                k++;
            }
            list.add(subArr);
        }
        return list;
    }
}
