package com.company.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("输入10个整数");
        Scanner s = new Scanner(System.in);

        List list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            int score = s.nextInt();
            list.add(score);
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);



    }
}
