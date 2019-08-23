package com.company.day16;
class SubThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if (i % 2 ==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class SubThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i % 2 !=0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class TestThread2 {
    public static void main(String[] args) {
        SubThread2 st2 = new SubThread2();
        SubThread3 st3 = new SubThread3();
        st2.start();
        st3.start();
    }
}
