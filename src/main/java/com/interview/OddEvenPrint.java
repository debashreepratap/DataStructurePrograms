package com.interview;

public class OddEvenPrint {
    int count = 1;
    public static void main(String[] args) {
        OddEvenPrint oddEvenPrint = new OddEvenPrint();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printOddNo();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrint.printEvenNo();
            }
        });
        t1.start();
        t2.start();

    }

    private void printEvenNo() {
     synchronized (this){
         while (count<10){
             while(count%2==1) {
                 try {
                     wait();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
                 System.out.println("t2   " + count);
                 count++;
                 notify();
         }
     }
    }

    private void printOddNo() {
        synchronized (this){
            while (count<10){
                while(count%2==0) {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("t1   " + count);
                count++;
                notify();
            }
        }
    }
}
