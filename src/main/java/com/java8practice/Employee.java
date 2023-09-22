package com.java8practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private int rollNo;
    private int avgMark;
    private String region;
}
