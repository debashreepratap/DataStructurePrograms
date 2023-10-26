package com.java8practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;


@SpringBootApplication
public class Java8PracticeApplication {

    public static void main(String[] args) {
       SpringApplication.run(Java8PracticeApplication.class, args);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(25, "krishna" , "Female"));
        personList.add(new Person(10, "debashree" , "Female"));
        personList.add(new Person(15, "sagar" , "Male"));
        personList.add(new Person(40, "baga", "Male"));
        personList.add( new Person(30, "balaji", "Male"));

        System.out.println("Person age greater than 20: ");
        System.out.println(personList.stream().filter(p -> p.getAge()>20).collect(groupingBy(Person::getAge)));

        System.out.println("==========================================================");
        System.out.println("Person List by Gender: ");
        System.out.println(personList.stream().collect(groupingBy(Person::getGender)));
        System.out.println("==========================================================");



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
                            new Person(10,"debashree" , "Female" ),
                            new Person(30, "sagar" , "Male"),
                            new Person(20, "krish" , "Female"));

         perList.stream().sorted((p1,p2) -> Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p1.getAge()))).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("HashMap size check");
        Map<Integer, String> hashMap = new HashMap<>(20);
        System.out.println("Default Hashmap size :"+hashMap.size());
        for (int i=1; i<=6; i++){
            hashMap.put(i, "Value"+i);
        }
        System.out.println("After 16 entries  Hashmap size :"+hashMap.size());


        Department dept1 = new Department(1,"IT");
        Department dept2 = new Department(2,"TECH");
        Department dept3 = new Department(3,"HR");

        Employee2 emp1 = new Employee2("debashree", 101, dept1,1000);
        Employee2 emp2 = new Employee2("sagar", 102, dept1,2000);
        Employee2 emp3 = new Employee2("baga", 103, dept2,5000);
        Employee2 emp4 = new Employee2("chaga", 104, dept2,12000);
        Employee2 emp5 = new Employee2("daga", 105, dept3,10000);

        List<Employee2> empList2 = new ArrayList<>();
        empList2.add(emp1);
        empList2.add(emp2);
        empList2.add(emp3);
        empList2.add(emp4);
        empList2.add(emp5);

        System.out.println("Get Max salaried employee from each department: ");
        System.out.println(empList2.stream()
                        .collect(groupingBy(
                            e -> e.getDept(),
                            collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)
                        )));

        System.out.println("Get Employee count department wise: ");
        System.out.println(empList2.stream().collect(groupingBy(e->e.getDept(), counting())));

        System.out.println("get maximum salaried employee:  ");
        System.out.println(empList2.stream().max(Comparator.comparing(Employee2::getSalary)));







    }

}
