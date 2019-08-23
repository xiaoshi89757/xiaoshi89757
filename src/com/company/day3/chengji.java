package com.company.day3;
import java.util.Scanner;
public class chengji {
    public static void main(String[] args) {
        //请输出学生个数，获取学生个数n
        //根据输入的学生的个数n,串讲一个长度为n的int型的数组
        //根据键盘获取学生的成绩，并赋予给相应的数组元素，获取n个学生的成绩
        //遍历学生成绩的数组，并根据学生的成句差值判断学生的等级
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的个数:");
        int count = s.nextInt();
        int[] scores = new int[count];
        int maxScore = scores[0];
        System.out.println("请输入"+ count + "个成绩:");

        for (int i = 0; i <count ; i++) {
            int score = s.nextInt();//依次从键盘获取学生的成绩
            scores[i] = score;
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是："+maxScore);
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] >= maxScore - 10){
                System.out.println("student "+ i + "score is " + scores[i] + "grade is A" );
            }else if (scores[i] >= maxScore - 20){
                System.out.println("student "+ i + "score is " + scores[i] + "grade is B" );
            }else if (scores[i] >= maxScore - 30){
                System.out.println("student "+ i + "score is " + scores[i] + "grade is C" );
        }else{
                System.out.println("student "+ i + "score is " + scores[i] + "grade is D");
            }
        }
    }
}
