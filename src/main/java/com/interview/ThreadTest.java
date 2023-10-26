package com.interview;

class ThreadTest implements Runnable{
    Object obj;

    public ThreadTest(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Object obj = new Object();
       Runnable r1= new ThreadTest(obj);
       Runnable r2= new ThreadTest(obj);
       new Thread(r1, "thread1").start();
       new Thread(r2, "thread2").start();
       
    }
    
    public void run(){
        synchronized (obj) {
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":::" + i);
            }
        }
    }
}