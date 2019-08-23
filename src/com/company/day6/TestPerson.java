package com.company.day6;

/*
* 构造器的作用:1)创建对象 2）给创建的对象的属性赋值
* 设计类时，不显示声明类的构造器话，系统默认提供一个空参的构造器
* 声明类的构造器。格式：权限修饰符 类名（形参）{}
* 类的多个构造器之间构成重载
*
* 二 1）属性的默认初始化 2）属性的显式初始化 3）通过构造器给属性初始化4）通过<对象.方法>给属性赋值
* */
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.getAge();
        p.setAge(250);
//        Person p2 = new Person(23);
    }
}

class  Person{
    private int age;
    //构造器 <显式定义类的构造器只有 默认的构造器不再提供
//    public Person(int n ){
//        name = n;
//    }
//    public  Person(){
//
//    }
    public void setAge(int a){
        if(a >0 && a < 130){
            age = a;
        }else{
            System.out.println("您输入的年龄有误");
        }
    }
    public int getAge(){
        return  age;
    }
}
