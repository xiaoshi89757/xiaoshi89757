package com.company.day17;
/*
* 存在线程安全问题
* 1.线程安全问题存在的原因
*      由于一个线程在操作共享数据的过程中 未执行完毕的情况下 另外的线程参与进来 导致贡献数据存在安全问题
*
* 2.如何来解决线程的安全问题
*   必须让一个线程操作完共享数据完毕以后 其他线程才有机会参与共享数据的操作
*
* 3.java如何实现线程的安全：线程同步机制
*       方式一：同步代码块
*       synchronized(同步监视器){
*           //需要被同步的代码块（操作共享数据的代码）
*       }
*       1.共享数据：多个线程共同操作的同一个数据（变量）
*       2.同步监视器：有一个类的对象来充当 哪个线程获取此监视器 谁就执行大括号里被同步的代码 俗称锁
*       要求：所有线程必须共用同一把锁
*       注:在实现的方式中，考虑同步的话 可以使用this来充当锁  继承的情况下
*       方式二：同步方法
*       将操作共享数据的方法声明为 synchronized 即此方法为同步方法 能够保证当其中一个线程执行此方法时
*       其他线程在外等待直至此线程执行完此方法 同步方法的锁 this 默认当前对象
*  */
class Window2 implements Runnable{
    int  ticket = 100;

    @Override
    public void run() {
        while(true) {
            show();
        }
    }
    public synchronized void show(){

            //this表示当前对象 本题中表示w
            if (ticket > 0){
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);


        }
    }
}
public class TestWindow2 {
    public static void main(String[] args) {
        Window2 w = new Window2();
        Thread t = new Thread(w);
        t.setName("线程1");
        t.start();
        Thread t1 = new Thread(w);
        t1.setName("线程2");
        t1.start();
        Thread t2 = new Thread(w);
        t2.setName("线程3");
        t2.start();
    }
}
