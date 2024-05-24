package com.zahid;
import java.lang.Thread;

public class Thread_meth {
    static class OneThread extends Thread{
        public void run(){
            int xxy = 0;
            while(xxy < 10000) {
                System.out.println("One");
                xxy++;
            }
        }
    }
    static  class MyThreadRunnable implements Runnable{
        public void run(){
            System.out.println("MyThreadRunnable 1");
        }
    } 
    static class TwoThread extends Thread{
        public void run(){
            int xxy = 0;
            while(xxy < 10000) {
                System.out.println("Two");
                xxy++;
            }
        }
    }
    public static void main(String[] args) {
        OneThread  g = new OneThread();
        TwoThread h = new TwoThread();
        g.start();
        h.start();
    }
}
