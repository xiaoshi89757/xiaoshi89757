package com.company.day16;
//单线程
public class TestMain {
    public static void main(String[] args) {
        method2("guan");

    }
    public static void method1(String str){
        System.out.println("method1");
        System.out.println(str);
    }
    public static void method2(String str){
        System.out.println("method2");
        method1(str);
    }
}
