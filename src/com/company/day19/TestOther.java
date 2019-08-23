package com.company.day19;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestOther {
    //6.获取注解
    @Test
    public void test6() {
        Class clazz = com.company.day19.Person.class;
        Annotation[] anns = clazz.getAnnotations();
        for (Annotation  a1:anns){
            System.out.println(a1);
        }
    }
    //5.获取所在的包
    @Test
    public void test5(){
        Class clazz = com.company.day19.Person.class;
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }
    //4.获取实现的接口
    @Test
    public void test4() throws ClassNotFoundException {
        String name  = "Person";
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class clazz = classLoader.loadClass(name);
        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces){
            System.out.println(c);
        }
    }
    //3.获取父类的泛型
    @Test
    public void test3() throws ClassNotFoundException {
        String name = "Person";
        Class clazz = Class.forName(name);
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType)type;
        Type[] ars = parameterizedType.getActualTypeArguments();
        System.out.println(((Class)ars[0]).getName());

    }
    //2.获取带泛型的父类
    @Test
    public void test2(){
        com.company.day19.Person p = new com.company.day19.Person();
        Class clazz = p.getClass();
        Type type = clazz.getGenericSuperclass();
        System.out.println(type);

    }
    //1.获取运行时类的父类
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
}
