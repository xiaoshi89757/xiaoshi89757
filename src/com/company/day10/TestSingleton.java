package com.company.day10;
/*
* 设计模式：23种
*
* 单例的设计模式：
* 1.解决的问题，使得一个类只能创建一个对象
* */
//饿汉式
public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));
    }


}
class Singleton{
    //1.私有化构造器 使得类的外部不能调用构造器
      private Singleton(){

     }
     //2.类的内部创建一个类的实例
    private static Singleton instance = new Singleton();
    //3.私有化对象，只能通过公共的方法调用
    //4.此公共的方法，只能通过类来调用,同时类的实例也必须为static声明
    public static Singleton getInstance() {
        return instance;
    }
}