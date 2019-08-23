package com.company.day17;
/*
* 关于懒汉式的线程安全问题 使用同步机制
* 对于一般的方法内 使用同步代码块 可以考虑使用this
* 对于静态方法而言 使用当前类本身充当锁
* */
/*
* 1.释放锁的操作
* 当前线程的同步方法，同步代码块执行结束
* 当前线程再同步代码块，同步方法中遇到break return终止了该代码块 该方法的技术之星
* 当前线程再同步代码块 同步方法中出现了未处理的error 或exception 导致异常结束
* 当前线程再同步代码块同步方法中执行了线程对象的wait()方法 当前线程展厅并释放锁
*
* 2.不释放锁的操作
* 线程执行同步代码块或同步方法时 程序调用thread.sleep() thread.yield()方法展厅当前线程的执行
* 线程执行同步代码块时 其他线程调用了该线程的suspend()方法将该线程挂起 该线程不会释放锁（同步监视器）
* */
class Singleton{
    private Singleton(){

    }
    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance ==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();


                }
            }
        }
        return instance;
    }
}

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));
        String str;
    }

}
