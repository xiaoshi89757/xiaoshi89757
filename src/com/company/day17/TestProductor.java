package com.company.day17;
class Productor implements Runnable{
    Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产商品");
        while(true){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.AddProduct();
        }
    }
}
class Customer1 implements Runnable{
    Clerk clerk;

    public Customer1(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费");
        while(true){
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
class Clerk {
     int product;

    public Clerk(int product) {
        this.product = product;
    }

    public Clerk() {
    }

    public  synchronized void AddProduct(){
        if (product >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            product++;
            System.out.println(Thread.currentThread().getName() + ":" + "生产了第"+product + "个产品");
            notify();
        }
    }
    public synchronized void consumeProduct(){
        if (product <1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName() + ":" + "消费了第" + product + "个产品");
            product--;
            notify();
        }
    }

}
public class TestProductor {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        Productor p1 = new Productor(c);
        Customer1 c1 = new Customer1(c);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);
        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();

    }
}
