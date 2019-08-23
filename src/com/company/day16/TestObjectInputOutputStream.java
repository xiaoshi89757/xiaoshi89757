package com.company.day16;

import org.junit.Test;

import java.io.*;

public class TestObjectInputOutputStream {
    //对象的反序列化国庆：将硬盘中的文件通过ObjectInputStream转换为相应的对象
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("person.txt"));
            Person p1 = (Person)ois.readObject();
            System.out.println(p1);
            Person p2 = (Person)ois.readObject();
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //对象序列化过程 ; 将内存中的对象通过ObjectOutputStream转换为二进制流 ，存储在硬盘文件中
    @Test
    public void testObjectOutputStream(){
        Person p1 = new Person("小米", 23);
        Person p2 = new Person("红米", 22);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("person.txt"));

            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
/*
* 要实现序列化的类
* 1.要求此类是可序列化的 实现Serializable接口
* 2.要求类的属性同样要实现Serializable
* 3.凡是实现Serializable接口的类都有一个表示序列化版本标识符的静态变量
* private static final long serialVersionUID
* 4.ObjectInputStream ObjectOutputStream 不能序列化static 和transient 修饰的成员变量
* */
class Person implements Serializable {
    private static final long serialVersionUID =213345L;
    String name;
    Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
