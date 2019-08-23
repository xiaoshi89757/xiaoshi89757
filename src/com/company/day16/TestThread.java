package com.company.day16;
/*
* 创建一个子线程 完成1-100之间的自然数的输出 同样的主线程执行同样的操作
* 船桨多线程的第一种方式：继承java.lang.thread类
* */
//1.创建一个继承于thread的子类
class SubThread extends Thread{
    //2.重写thread类的run()方法 方法内实现子线程要完成的功能
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName() +":" +  i);
        }
    }

    public SubThread(String name) {
        super(name);
    }

    public SubThread() {
    }
}
public class TestThread {
    public static void main(String[] args) {
        //3.创建一个子类的对象
        SubThread st1 = new SubThread();
        SubThread st2 = new SubThread();
        //4.调用线程的Start()。启动此线程，调用相应的run()方法
        //5.一个线程只能够执行一次start()
        //不能通过thread实现类对象的run()去启动一个线程
        st1.start();
        st2.start();
        for (int i = 0; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName() +":"+ i);
        }

    }
}
