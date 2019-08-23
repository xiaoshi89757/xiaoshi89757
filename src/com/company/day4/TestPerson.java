package com.company.day4;

import java.util.Scanner;
public class TestPerson {
    public static void main(String[] args) {
        System.out.println("请输入人加的岁数为：");
        Scanner s = new Scanner(System.in);
        Person p = new Person();
        int i = s.nextInt();
        p.study();
        p.showage();
        System.out.println("人的年龄为："+ p.addAge(i));
    }
}
class Person{
        String names;
        int age;
        int sex;
        public void study(){
            System.out.println("studying");
        }
        public void showage(){
            System.out.println(age);
        }
        /*  public void showage(){
            System.out.println(age);
        }
        * */
        public int addAge(int i){
            age += i;
            return age;
        }
}
