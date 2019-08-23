package com.company.day10;
//懒汉式 存在线程安全问题
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s3 =Singleton1.getInstance();
        Singleton1 s4 =Singleton1.getInstance();
        System.out.println(s3.equals(s4));
    }
}
class Singleton1{
    private Singleton1(){

    }
    private static Singleton1 instance = null;

    public  static Singleton1 getInstance() {
        if(instance ==null){
            instance = new Singleton1();
        }
        return instance;
    }
    /*public boolean equals(Object obj){
        return false;
    }*/
}