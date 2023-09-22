package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        List<Eployeee> empList = new ArrayList<>();
        empList.add(new Eployeee("debashree", 10000, "IT"));
        empList.add(new Eployeee("pratap", 20000, "Tech"));
        empList.add(new Eployeee("xyz", 15000, "IT"));
        empList.add(new Eployeee("abc", 30000, "Xyz"));

        AtomicInteger sumSalary = new AtomicInteger();
       // System.out.println(empList.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.summarizingInt(Eployeee::getSalary)));

        empList.stream().filter(e -> e.getDepartment().equals("IT")).mapToInt(Eployeee::getSalary).sum();

        empList.stream().filter(e -> e.getDepartment().equals("IT")).forEach(emp -> sumSalary.addAndGet(emp.getSalary()));

        System.out.println("sumSalary: "+sumSalary);
        int[] arr={5, 4, 1, 7, -8, -9};

        System.out.println(arr);

        int[] actualARR= new int[arr.length];

        for(int i=0; i<arr.length; i++){
            actualARR[i] = arr[i];
        }

        Arrays.sort(arr);
         int sumGood=0;
         int sumBad=0;

        for (int i=0; i<arr.length; i++){
            if(arr[i]== actualARR[i])
                sumGood=sumGood+arr[i];
            else
                sumBad = sumBad +arr[i];

        }
        System.out.println(sumGood-sumBad);

    }
}
