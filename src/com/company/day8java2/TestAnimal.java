package com.company.day8java2;
/*
* 多态性不适用于属性
* */
public class TestAnimal {
    public static void main(String[] args) {
        TestAnimal t = new TestAnimal();
        t.func(new Animal());
        t.func(new Dog());
        t.func(new Cat());
    }
    public void func(Animal a){
        a.eat();
        a.jump();

        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.Wang();
        }
        if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }
    }
}
class Animal{
    String name;
    int age;

    public void eat(){
        System.out.println("进食");
    }
    public void jump(){
        System.out.println("跳");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗进食");
    }
    public void jump(){
        System.out.println("狗跳");
    }
    public void Wang(){
        System.out.println("狗叫");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫进食");
    }
    public void jump(){
        System.out.println("猫跳");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}