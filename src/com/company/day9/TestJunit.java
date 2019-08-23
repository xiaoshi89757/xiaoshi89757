package com.company.day9;

/*
* 基本数据类型--对应的包装类，调用包装类的构造器
* */

public class TestJunit {
    public static void main(String[] args) {
        //基本数据类型、包装类 -- String 调用静态重载方法 valueof
        int i6 = 10;
        String str1 = i6 + "";//10
        System.out.println(str1.toString());
        String str2 = String.valueOf(i6);
        String str3 = String.valueOf(true);
        System.out.println(str2);
        //String 转换为 基本数据类型、包装类 只有包装类有方法 调用包装类的parssxxx
        int i7 =Integer.parseInt(str1);
        boolean b3 = Boolean.parseBoolean(str3);
        Boolean b4 = Boolean.parseBoolean(str3);
        System.out.println(b3);
        System.out.println(b4.toString());
        String str = "AA";
        System.out.println(str);
        com.company.day9.test1 t1 = new test1();
        //基本数据类型转成包装类
        //Boolean 除了true 其他都是false
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("true123");//false
        System.out.println(b2.toString());
        int i = 20;
        Integer i1 = new Integer(1);
        System.out.println(i1.toString());
        //包装类 -- 基本数据类型 调用包装类xxxvalue;
        int i2=i1.intValue();

        //JDK5.0 之后自动拆箱和装箱
        int i3= 12;
        Integer i4 = i3;
        int i5 = i4;



    }

    public void test1(){
        System.out.println("guanguan");
    }
}
