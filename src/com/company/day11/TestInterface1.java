package com.company.day11;
//接口和具体的实现类之间有多态性
//通过接口可以实现不同相关类的相同行为，不需要考虑这些类之间的层次关系
//通过接口可以指明多个类需要实现的方法，一般用于定义对象的扩张功能
//接口用来定义规范，解除耦合关系

public class TestInterface1 {
    public static void main(String[] args) {
        Duck d= new Duck();
        TestInterface1.test1(d);
        TestInterface1.test2(d);
        TestInterface1 t= new TestInterface1();
        t.test3(d);
    }
    public static void test1(Runner r){   //Runner r = new Duck();
        r.run(); //虚拟方法调用
    }
    public static void test2(Filer f){   //Filer f = new Duck();
        f.fly();
    }
    public void test3(Swimmer swimmer){
        swimmer.swim();
    }
}
interface Runner{
    void run();
}
interface Swimmer{
    public abstract void swim();
}
interface Filer{
    void fly();
}
class   Duck implements Runner,Swimmer,Filer{
    @Override
    public void run() {
        System.out.println("错误");
    }

    @Override
    public void swim() {
        System.out.println("管管");
    }

    @Override
    public void fly() {
        System.out.println("丑小鸭也可以变成白天鹅！");
    }
}