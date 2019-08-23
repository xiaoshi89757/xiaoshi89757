package com.company.day7;
/*
* this :
* 1)可以用来修饰属性，方法，构造器
* 2）this理解为当前对象或当前正在创建的对象
* */
public class TestPerson {
    public static void main(String[] args) {
        Person1 p = new Person1();
    }
}
class Person1{
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    public void setAge(int a ){
        age = a;
    }

    public int getAge() {
        return age;
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
}
