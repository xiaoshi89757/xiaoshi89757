package com.company.day2;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输出你的幸运号"+ ":");
        int a = s.nextInt();
        int j = 1;
        int m = a+j;

        System.out.println("你的抽奖号为"+ ":" +m);



    }
}
