package com.java8practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee2 {

    private String name;
    private int rollNo;
    private Department dept;
    private int salary;
}
