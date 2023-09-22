package com.java8practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
public class Java8PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java8PracticeApplication.class, args);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(25, "krishna"));
        personList.add(new Person(10, "debashree"));
        personList.add(new Person(15, "sagar"));
        personList.add(new Person(40, "baga"));
        personList.add( new Person(30, "balaji"));

        System.out.println("Person age greater than 20: ");
        System.out.println(personList.stream().filter(p -> p.getAge()>20).collect(Collectors.groupingBy(Person::getAge)));


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("de", 1,40,"Banglore"));
        employeeList.add(new Employee("sagar", 2,30,"Banglore"));
        employeeList.add(new Employee("mamuni", 5,50,"Cuttack"));

        System.out.println("Employees with Region starts with B and mark greater then 35");
        List<Employee> filteredList = employeeList.stream().filter(e ->e.getRegion().startsWith("B")).filter(e->e.getAvgMark()>35).collect(Collectors.toList());
        System.out.println(filteredList);

        System.out.println("Employees partitioned by age greater than 20");
        System.out.println(personList.stream().collect(Collectors.partitioningBy(p ->p.getAge()>20)));


        System.out.println("Get phone number from a map");
        PhoneBookDirectory phoneBook = new PhoneBookDirectory();
        phoneBook.getPhoneBookMap().forEach((name, number) -> {if(name.equals("debashree"))
            System.out.println(phoneBook.getPhoneBookMap().get(name));

        });

        System.out.println("Reverse all the Strings in a List::");
        List<String> listString = Arrays.asList("mamuni","sagar","debashree");
        listString.stream().forEach( s -> {
                    String reversedString = new StringBuilder(s).reverse().toString();
                    System.out.println(reversedString);
                });
        List<String> str = Arrays.asList("lmn", "abc", "xyz", "pqr");
        System.out.println("Sort all the of a list:");
        System.out.println(str.stream().sorted().collect(Collectors.toList()));

        System.out.println("Sort Person entities using java8 streams : ");

        List<Person> perList = Arrays.asList(
                            new Person(10,"debashree"),
                            new Person(30, "sagar"),
                            new Person(20, "krish"));

         perList.stream().sorted((p1,p2) -> Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p1.getAge()))).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("HashMap size check");
        Map<Integer, String> hashMap = new HashMap<>(20);
        System.out.println("Default Hashmap size :"+hashMap.size());
        for (int i=1; i<=6; i++){
            hashMap.put(i, "Value"+i);
        }
        System.out.println("After 16 entries  Hashmap size :"+hashMap.size());






    }

}
