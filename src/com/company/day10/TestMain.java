package com.company.day10;
/*
* 类的第四个成员 ：初始化块（或者代码块）
* 代码块如果有修饰符 只能是static
*  一个类中可以有多个非静态的代码块 多个代码块
* 非静态的代码块：可以对属性进行复制 初始化块执行晚于属性复制
* 属性赋值的操作：
* 1.默认的初始化 2.显示的初始化或代码块的初始化（两个结构按照顺序进行） 3。构造器中赋值 4.通过方法赋值
*
* 静态代码块：
* 1.里面可以有输出语句
* 2.随着类的加载而加载，而且只能被加载一次
*
* */
public class TestMain {
    public static void main(String[] args) {
      /*  for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);

        }
        int[] arg = new int[1000];
        for (int i = 0; i <arg.length ; i++) {
            System.out.println("value"+i);
        }
        System.out.println(arg.toString());
        int[][] arg2 = new int[3][2];
        System.out.println(arg2.length);*/
        Main m = new Main();
        new TestMain().xiaoshi();

    }
    public double xiaoshi(){
        return 3.4;
    }
}
class Main{
    private  int orderId = 1001;
    public  int getorderId(){
       return orderId;
    }
    {
        orderId= 1002;
        System.out.println( "静态1");
    }

}

