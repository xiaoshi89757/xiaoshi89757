package com.company.day11;
/*
* java.lang.Throwable
* Error:错误，程序中不做处理
* Exception:异常，要求在编写程序时，就要考虑对异常的处理
*   编译时异常 在编译期间出现的异常
*   运行时异常 在运行期间出现的异常
* */

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int i = s.nextInt();
        int sum =0;
        if (i>=0) {
            for (int j = 0; j < 3; j++) {
                sum += i;
            }
            System.out.println("总和为"+sum);
        }else{
            throw new RuntimeException("输入负数有误");
        }
    }
}

