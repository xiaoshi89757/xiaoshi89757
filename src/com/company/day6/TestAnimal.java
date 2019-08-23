package com.company.day6;
/*
* 面向对象的特征一：封装与隐藏
* 1：创建了类的对象之后，如果直接通过（对象.属性）的方式对相对应的对象赋值的话，
* 可能出现不满足情况的意外，我们考虑不让对象直接作用属性，而是通过（对象.方法）
* 的形式，来控制对象对属性的访问，实际情况中，对属性的要求就可以通过方法来体现
* 2：private 修饰的属性 ，只能在本类中被调用，出了此类，不能被调用
* 3：设置类的属性和获取类的属性 get/set
*
* */


public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "花花";
        a1.legs = 4;
        a1.info();
        a1.eat();
        a1.setlegs(5);

    }
}
class Animal{
    String name ;//名字
    int legs;//腿的个数

    public void eat(){
        System.out.println("动物进食");
    }
    public void sleep(){
        System.out.println("动物睡觉");
    }
    public void info(){
        System.out.println("name:" + name + "\t"+"legs:" + legs);
    }

    public void setlegs(int l){
        if(l > 0 && l % 2 ==0){
            legs = l;
        }else{
            System.out.println("您输入的数据有误！");
        }

    }

}
