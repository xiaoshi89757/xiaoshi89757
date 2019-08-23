package com.company.day1;
        import java.util.Scanner;
public class Exer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;//记录正数的个数
        int b = 0;//记录负数的个数
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i +1) + "个整数");
            int num = s.nextInt();
            if(num>0)
                a++;
            else if (num <0)
                b++;
            else break;//不知道使用多少次的循环用break；
        }
        System.out.println("正数的个数为："+a);
        System.out.println("负数的个数为："+b);

    }
}
