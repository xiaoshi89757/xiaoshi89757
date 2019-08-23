package com.company.day10;
/*
* abstract:抽象的 可以用来修饰类，方法
*
* 1.abstract修饰类，抽象类
* 1）不可被实例化 但是有构造器  凡是类都有构造器
*  抽象方法所在的类一定是抽象类 抽象类中可以没有抽象方法
 *
* 2.abstract修饰方法：抽象方法
* 没有方法体，包括{} public abstract void eat();
* 抽象方法只保留方法的功能，而具体的执行，交给继承抽象类的子类，
* 若子类继承抽象类，并重写了所有的抽象方法，则此类的是一个实体类，可以实例化
* 若子类继承抽象类，并没有重写所有的抽象方法，意味着此类中还有抽象方法 则此类必须声明为抽象类
*
*
* */
public class TestAbstract {
}
abstract class Person{
    public abstract void eat();
    public abstract void walk();
}
class student extends Person{
    public void eat(){
        System.out.println("人吃饭");
    }
    public void walk(){
        System.out.println("人走路");
    }
        }