package com.company.day19;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflection {
    //如何获取Class的实例（3种）
    @Test
    public void  test4() throws ClassNotFoundException, IOException {
        //1.调用运行时类本身的.class属性
        Class clazz1 = Person.class;
        System.out.println(clazz1.getName());

        //2.通过运行时类的对象获取
        Person p = new Person();
        Class clazz2 = p.getClass();
        System.out.println(clazz2.getName());

        //3.通过Class的静态方法
         String className = "Person";
         Class clazz3 = Class.forName(className);
        System.out.println(clazz3);

        //4.通过类的加载器(了解)
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class clazz4 = classLoader.loadClass(className);
        System.out.println(clazz4);

        //掌握
        ClassLoader loader = this.getClass().getClassLoader();
        //InputStream is =loader.getResourceAsStream("test1.txt");
        FileInputStream is = new FileInputStream(new File("test1.txt"));
        Properties pros = new Properties();
        pros.load(is);
        String name = pros.getProperty("name");
        System.out.println(name);

    }
    /*
    * java.lang.Class是反射的源头。
    *
    * 我们创建了一个类。通过编译（javac.exe）,生成对应的.class文件 之后我们使用
    * java.exe加载（jvm的类加载器完成的）.class 文件 此.class文件加载到内存以后 就是一个运行时类，存放在缓冲区
    * 那么这个运行时类本身就是一个Class的实例
    * 1.每一个运行时类只加载一次
    * 2.有了Class实例实例之后 我们才可以进行如下的操作
    *   1>*创建对应的运行时类的对象
    *   2>可以获取对应的运行时类的完整结构（属性，方法，构造器 内部类 父类 所在的包 异常）
    *   3>*调用对应的运行时类的指定的结构（属性，方法，构造器）
    *   4>反射的应用 动态代理
    *
    *  正常方式： 引入需要的“包类”名称-->通过new实例化-->取得实例化对象
    *  反射方式:  实例化对象-->getClass()方法-->得到完整的“包类”名称
    * */
    @Test
    public void test3(){
        Person p = new Person();
        Class clazz = p.getClass(); //通过运行时类的对象 调用其getClass() 返回其运行时类
        System.out.println(clazz);
    }
    //有了反射 可以用过反射创建一个类的对象 并调用其中的结构
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        //1.创建clazz 对应的运行时类Person类的对象
        Person p =clazz.getDeclaredConstructor().newInstance();
        //2.通过反射调用运行时累得指定的属性
        //2.1 public
        Field f1 = clazz.getField("name");
        f1.set(p, "管帅");
        System.out.println(p);
        //2.2 private
        Field f2 = clazz.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(p, 20);
        System.out.println(p);
        //3.通过反射调用运行时类的指定的方法
        Method m1 =clazz.getMethod("show");
        m1.invoke(p);

        Method m2 = clazz.getMethod("display", String.class);
        m2.invoke(p,"China");


    }
    //有反射以前 如何调用一个类的对象 并调用其中的方法 属性
    @Test
    public void test1() throws Exception {
        Person p = new Person();
        p.display("hk");
    }
}
