package com.company.day16;

/*
* Thread的常用方法
* 1.start() 启动线程并执行相应的run方法()
* 2.run() 子线程要执行的代码放入run()方法
* 3.currentThread() 静态的 调取当前的线程
* 4.getName() 获取此线程的名字
* 5.setName() 设置此线程的名字
* 6.yield() 调用此方法的线程释放当前cpu的执行权
* 7.join() 在A线程中调用B线程join()方法，表示当执行到此方法，A线程停止执行 直至B线程执行完毕 A线程再join
* 8.isAlive 判断线程是否还存活
* 9.sleep( long l ) 显示的让当前线程睡眠l毫秒
* 10.线程通信 wait() notify() notifyAll()+
* */

class SubThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            /*try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName() +":" +Thread.currentThread().getPriority()  +":"+ i);
        }
    }
}
public class TestThread1 {
    public static void main(String[] args) {

        SubThread1 st1 = new SubThread1();
        st1.setName("子线程");
        Thread.currentThread().setName("=======主线程");
        st1.setPriority(Thread.MAX_PRIORITY);
        st1.start();
        for (int i = 0; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName() +":"+ +Thread.currentThread().getPriority()  +":"+ i);
            /*if (i  ==20){
//                Thread.currentThread().yield();
                try {
                    st1.join();
                    System.out.println( Thread.currentThread().isAlive());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
*/
        }
    }
}
