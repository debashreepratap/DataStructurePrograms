package com.java8practice;

public class MagicNoArray {
    public static void main(String[] args) {
        int[] arr = {8, -3, 2, 5, 4, 1};
        //   -3,1,2,4,5,8
        int[] originalArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            originalArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sumGood = 0;
        int sumBad = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(originalArr[i] + "    " + arr[i]);
            if (arr[i] == originalArr[i])
                sumGood = sumGood + arr[i];
            else
                sumBad = sumBad + arr[i];
        }
        System.out.println();
        System.out.println("sumGood :" + sumGood);
        System.out.println("sumBad :" + sumBad);
        System.out.println("Magic Number :" + (sumBad - sumGood));
    }

}
