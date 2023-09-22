package com.java8practice;


class A{
    public void show() throws RuntimeException {
        System.out.println("A");
    }
}
class B extends A{
    public void show() throws  NullPointerException{
        System.out.println("B");
    }
}
public class Test {
    public static void main(String[] args) {
        A a= new B();
        a.show();
    }
}
