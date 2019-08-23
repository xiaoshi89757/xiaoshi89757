package com.company.day3;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入学生的个数：");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        System.out.println("请输入" + count + "个成绩");
        int[] scores = new int[count];
        int maxScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            int score = s.nextInt();
            scores[i] = score;
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        System.out.println("本场考试成绩最高的分数是：" + maxScore);
        for (int i = 0; i < scores.length; i++) {


            char level;
            if (scores[i] >= maxScore - 10) {
                level = 'A';
            } else if (scores[i] >= maxScore - 20) {
                level = 'B';
            } else if (scores[i] >= maxScore - 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
        }
    }
}
