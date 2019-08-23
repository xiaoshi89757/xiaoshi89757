package com.company.day17;
/*
*
* */
class Communication implements Runnable{
    int num = 1;

    @Override
    public void run() {
        while (true) {
        synchronized (this) {
            notify();
                if (num <= 100) {
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " :" + num);
                    num++;

                } else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
public class TestCommunication {
    public static void main(String[] args) {
        Communication com = new Communication();
        Thread t1 = new Thread(com);
        Thread t2 = new Thread(com);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();

    }

}
