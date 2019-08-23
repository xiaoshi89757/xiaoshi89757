package com.company.day19;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestConstructor {
    @Test
    public void test1() throws Exception{
        String className = "Person";
        Class clazz = Class.forName(className);
        //创建对应的运行时类的对象 使用newInstance() 实际上就是调用了运行时类的空参构造器
        //要想能创建成功，1.要求对应的运行类要有空参的构造器2.构造器的权限修饰符的权限要足够


        Object obj = clazz.getDeclaredConstructor().newInstance();
        com.company.day19.Person p = (Person)obj;
        System.out.println(p);
    }
    @Test
    public void test2() throws ClassNotFoundException {
         String className = "Person";
         Class clazz = Class.forName(className);
         Constructor[] cons = clazz.getDeclaredConstructors();
         for (Constructor c :cons){
             System.out.println(c);
         }
    }
}
