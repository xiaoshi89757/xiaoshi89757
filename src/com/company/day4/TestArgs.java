package com.company.day4;
/*
* 可变个数的形参的方法
* 1：格式：对于方法的形参：数据类型 ...行参名
* 2：可变个数的形参的方法与同名的方法之间构成行参
* 3：可变个数的形参在调用时，个数从0个开始，到无穷个都可以
* 4:使用可变多个形参的方法与方法的形参使用数组是一致的
* 5：若方法中存在可变个数的形参，那么一定要声明在方法形参的后面
* 6:在一个方法中，最多可以生命一个可变个数的形参
* 在类中定义了重载的可变个数的行参的方法之后，重载的方法可以省略
* */
public class TestArgs {
    public static void main(String[] args) {
        TestArgs t = new TestArgs();
        t.sayHello();
        t.sayHello("xiaoshi");
        t.sayHello(new String[]{"guan","shuai"});
    }
    public void sayHello(){
        System.out.println("hello world!");
    }
    public void sayHello(String str1){
        System.out.println("hello " + str1);
    }
    public void sayHello1(String[] args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
    public void sayHello(String ... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i] + "$");
        }
    }
    public void sayHello(int i ,String ... args){
        for (int j = 0; j <args.length ; j++) {
            System.out.println(args[j] + "$");
        }
    }
    public int getSum(int ... args){
        int sum =0;
        for (int i = 0; i <args.length ; i++) {
             sum += args[i];

        }return sum;
    }
}
