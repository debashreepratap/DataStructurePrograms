package com.java8practice;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class PhoneBookDirectory {

    private Map<String, String> PHONE_BOOK = new HashMap<String, String>(){
        {
            put("debashree", "3223432423");
            put("pratap", "6787687677");
            put("sagar", "7877709765");
            put("nayak", "786687676876");
        }
    };

    private Map<String, String> phoneBookMap = PHONE_BOOK;


}
