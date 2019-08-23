package com.company.day7;
import java.util.Scanner;
/*
* import :
* 1）显式导入制定包下的类或接口
* 2）写在包的声明和源文件之间
* 3）如果需要引入多个类或接口 那么久并列写出
* 4）如果导入的类时java.lang 比如：System String Math等，不需要显式的声明
* 5）有* 比如 java.util.*;
* 6)import static 表示导入制定类的static的属性和方法：
* import static java.lang.System.out<后面的输出语句可省略System
* 7）不能导入目录下的子包，只能导入当前目录
* */
public class TestPackageImport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数值");
        int a = s.nextInt();
        System.out.println("请输入第二个数值");
        int b = s.nextInt();
        System.out.println("结果是：" + a*b);
    }
}
