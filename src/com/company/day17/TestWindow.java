package com.company.day17;
class window extends Thread{
    static int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            for (; ; ) {
                if (ticket > 0) {
                    /*try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(Thread.currentThread().getName() + ":" + "\t" + ticket--);
                }
            }
        }
    }
     /* while(true){
          if (ticket > 0){
              System.out.println(Thread.currentThread().getName() +":"+"\t" + ticket--);
          }
      }*/

    public window(String name ){
        super(name);
    }
}
public class TestWindow {
    public static void main(String[] args) {

        window w1 = new window("窗口1");
        window w2 = new window("窗口2");
        window w3 = new window("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
