package com.company.day14;

import java.util.ArrayList;
import java.util.List;

/*
* 注解
* 1.jdk提供常用的注解
*   @Override :限定重写父类方法，该注释只能用于方法
*   @Deprecated ：用于表示谋和程序元素（类，方法）已过时
*   @SuppressWarnings: 抑制编译器警告
* 2.如何自定义一个注解
*
* 3.元注解
* */
public class TestAnnotation {
    public static void main(String[] args) {
        Preson p  = new Student();
        p.walk();
        @SuppressWarnings({"unused"})
        List list = new ArrayList();
    }
}
@MyAnnotation(value = "guanguan")
class Student extends Preson{
    @Override
    public void walk(){
        System.out.println("学生走");
    }
    @Override
    public void eat(){
        System.out.println("学生吃");
    }

}
class Preson{
     String name;
     int age;

    public Preson() {
    }

    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Deprecated
    public void walk(){
        System.out.println("走");
    }

    public void eat(){
        System.out.println("吃");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}