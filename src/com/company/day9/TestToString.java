package com.company.day9;

/*
* java.lang.Object类的toString()方法
* public String toString(){
*   return getClass().getName() +"@" + Integer.toHexString(hashCode());
* }
* 当我们打印一个对象的引用时，实际上默认调用的就是这个对象的toString()方法
* 当我们打印的对象所在的类没有重写Object的toString()方法时，那么调用的就是Object
* 中的toString()方法时，那么调用的就是Object中定义的toString()返回此对象所在的类及对应的
* 堆空间对象实体的首地址值
* 2)打印的对象所在的类重写了toString()方法时，调用的就是我们自己重写的toString()
* 3)字符串 date重写了toString()
* */

public class TestToString {
    public static void main(String[] args) {
        com.company.day9.Person p1 = new com.company.day9.Person("AA",10);
        System.out.println(p1.toString());
    }
}
