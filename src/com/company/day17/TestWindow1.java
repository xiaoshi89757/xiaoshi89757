package com.company.day17;
/*
* 多线程的优点
* 1.提高应用程序的相应 对图形化界面更有意义 可增强用户体验
* 2.提供计算机系统的CPU的利用率
* 3.改善程序结构，将既长又复杂的进程分为多个线程 独立运行 利与理解和修改
* 存在线程安全问题
* */
class Window1 implements Runnable{
    int  ticket = 100;
    @Override
    public void run() {

        while(true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            }else{
                break;
            }
        }
    }
}
public class TestWindow1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t = new Thread(w);
        t.setName("线程1");
        t.start();
        Thread t1 = new Thread(w);
        t1.setName("线程2");
        t1.start();
    }
}
