package com.interview;

class X{
    int a;
    public  static void show(){
        System.out.println("X");
    }
}
class B extends X{
    //@Override
    public static  void show(){
        System.out.println("B");
    }
}
public class Test2 {
    public static void main(String[] args) {
        X x = new B();
        x.show();

        B b =new B();
        b.show();


    }


}
