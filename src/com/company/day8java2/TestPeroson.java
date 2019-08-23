package com.company.day8java2;

/*
* 面向对象的特征三：多态性
* 1.多态性指什么：多态性可以理解一个事物的多种表现形态。
*   1）方法的重载与重写 2）子类对象的多态性
*
* 2.多态性前提：1）要有类的继承 2）要有子类对父类方法的重写
*
* 3.程序运行分为编译状态和运行状态
*   对于多态性来说，编译时看左边将此引用变量理解为父类的类型，
*   运行时，看右边，关注于真正的对象的实体，子类的对象，执行的方法时子类重写的方法
* */
public class TestPeroson {
    public static void main(String[] args) {
        Person p = new Person();
         p.eat();
         p.walk();
         // 子类对象的多态性 父类的引用指向子类的对象
       Person p1 = new Man();//向上转型，调用子类的实体给父类
        //虚拟方法调用，通过父类的引用指向子类的对象实体，当调用方法时，执行的是子类重写父类的方法
        p1.eat();
        Man p2 = (Man)p1; //向下转型 使用强转符（）
        //instanceof
        //格式：对象a instanceof 类A  判断对象a是否是A的一个实例，如果是返回true,不是返回flase
        //若a是A的实例，那么a也一定是A的父类的实例
        if (p1 instanceof Women){
            Women w1 = (Women)p1;
            w1.eat();
        }
    }
}
