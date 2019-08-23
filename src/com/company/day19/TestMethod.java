package com.company.day19;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestMethod {
    //1.获取运行时类的方法
    @Test
    public void test1() throws ClassNotFoundException {
        String name = "Person";
        ClassLoader classLoader =this.getClass().getClassLoader();
        Class clazz = classLoader.loadClass(name);
//        Object obj = clazz.getDeclaredConstructor().newInstance();
        //1.getMethods()获取运行时类及父类中所有声明为public的方法
        Method[] method = clazz.getMethods();
        for (Method m : method){
            System.out.println(m);
        }
        //2.getDeclaredMethods() 获取运行时类本身声明的所有的方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods){
            System.out.println(m);
        }

    }
    //注解 权限修饰符 返回值类型 方法名 形参列表 异常
    @Test
    public void test2(){
        Class clazz = com.company.day19.Person.class;
        Method[] m2 = clazz.getDeclaredMethods();
        for (Method m :m2){
            //1.注解
            Annotation[] a =m.getAnnotations();
            for (Annotation a1 :a){
                System.out.print(a1.toString() + " ");
            }
            //2.权限修饰符
           String str = Modifier.toString(m.getModifiers());
            System.out.print(str + " ");

            //3.返回值类型
            Class returnType =  m.getReturnType();
            System.out.print(returnType + " ");

            //4.方法名
            System.out.print(m.getName());
            //5.形参列表
            System.out.print("(");
            Class[] params = m.getParameterTypes();
            for (Class p : params){
                System.out.print(p.getName());
            }
            System.out.print(")");

            //6.异常类型
            Class[] exps = m.getExceptionTypes();
            if (exps.length != 0){
                System.out.println("throws");
            }
            for (int i = 0; i <exps.length ; i++) {
                System.out.print(exps[i].getName());
            }
            System.out.println();
        }
    }
    @Test
    public void test3() throws Exception {
        Class clazz = com.company.day19.Person.class;
        //getMethod(String methodName,Class...params)获取运行时类声明为public的指定的方法
        Method m1 = clazz.getMethod("show");
        com.company.day19.Person p = (com.company.day19.Person) clazz.getConstructor().newInstance();
        //调用指定的方法：Object invoke(Object obj)
        Object returnvalue = m1.invoke(p); //我是一个人
        System.out.println(returnvalue);

        Method m2 = clazz.getMethod("toString");
        Object returnvalue1 = m2.invoke(p);
        System.out.println(returnvalue1);

        //调用静态方法
        Method m3 = clazz.getMethod("info");
        m3.invoke(com.company.day19.Person.class);

        //getDeclaredMethod(String methodName,Class ...params)获取运行时类中指定的方法
        Method m4 = clazz.getDeclaredMethod("display", String.class);
        m4.setAccessible(true);
        m4.invoke(p,"chn");
}
        //调用指定的构造器
        @Test
        public void test4() throws Exception {
            String className = "Person";
            ClassLoader classLoader = this.getClass().getClassLoader();
            Class clazz = classLoader.loadClass(className);
            Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
            cons.setAccessible(true);
            com.company.day19.Person p = (Person) cons.newInstance("guanshuai",20);
            System.out.println(p);
        }
}
