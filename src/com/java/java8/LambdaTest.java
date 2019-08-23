package com.java.java8;

import org.junit.Test;

import java.util.Comparator;

/*
* Lambda表达式的使用举例
* */
public class LambdaTest {
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };
        r1.run();
        System.out.println("**************************");
        Runnable r2 = () -> System.out.println("我爱北京");

        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int i =com1.compare(12, 21);
        System.out.println(i);
        //Lambda 表达式的写法
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1, o2);

        int i1 =com1.compare(25, 21);
        System.out.println(i1);
        //方法引用 （：：）
        Comparator<Integer> com3 = Integer ::compare;
        int i2 =com1.compare(25, 21);
        System.out.println(i2);

    }
}


