package com.company.day19;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestField {
    //获取对应的运行时类的属性
    @Test
    public void test1() throws ClassNotFoundException {
        String name = "Person";
        ClassLoader cl = this.getClass().getClassLoader();
        Class clazz = cl.loadClass(name);
        //getFields() 只能获取到运行时类中及其父类中声明为public的属性
        Field[] fields =clazz.getFields();
        for (int i = 0; i <fields.length ; i++) {
            System.out.println(fields[i]);
        }
        System.out.println();
        //getDeclaredFields 获取运行时类本身声明的所有的属性
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field f :fields1){
            System.out.println(f.getName() );
        }

    }
    //权限修饰符 变量类型 变量名
    //获取属性的各个部分的内容
    @Test
    public void test2(){
        Class clazz = com.company.day19.Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field f :fields){
            //1.获取每个属性的权限修饰符
            int i = f.getModifiers();
            String str =Modifier.toString(i);
            System.out.print(str + " ");
            //2.获取属性的变量类型
            Class type = f.getType();
            System.out.print(type.getName() + " ");
            //3.获取属性名
            System.out.print(f.getName());
            System.out.println();
        }
    }
    //调用运行时类中指定的属性
    @Test
    public void test3() throws Exception {
        Class clazz = com.company.day19.Person.class;
        //1.获取指定的属性
        //getField(String fieldName)获取运行时类中声明为public的指定属性名为fieldName的属性
        Field name = clazz.getField("name");
        //2.创建运行时类的对象
        com.company.day19.Person p = (Person) clazz.getDeclaredConstructor().newInstance();
        System.out.println(p);
        //3.将运行时类指定的属性赋值
        name.set(p, "shuai");
        System.out.println(p);

        Field age = clazz.getDeclaredField("age");
        //getDeclaredField(String fieldName) 获取运行时类中指定为fieldName 的属性
        //由于属性权限修饰符的限制，为了保证可以给属性赋值，需要在操作前使得此属性可被操作
        age.setAccessible(true);
        age.set(p, 10);
        System.out.println(p);
    }
}
