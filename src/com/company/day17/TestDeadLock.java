package com.company.day17;
/*
* 死锁的问题 处理线程同步时容易出现
* 不用的线程分别占用对方需要的同步资源不放弃 都在等待对方放弃自己需要的同步资源 就形成了线程的死锁
* */
public class TestDeadLock {
    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(sb1){
                    sb1.append("A");

                    synchronized (sb2){
                        sb2.append("B");
                        System.out.println(sb1);
                        System.out.println(sb2);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb2){
                    sb2.append("C");
                    synchronized(sb1){
                        sb1.append("D");
                        System.out.println(sb1);
                        System.out.println(sb2);
                    }
                }
            }
        }.start();
    }
}
