package com.company.day9;
import java.util.Scanner;
import java.util.Vector;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩(输入负数默认结束)");

        Vector v = new Vector();
        int maxScores = 0;
        for (; ;) {
            int score = s.nextInt();

            if (score < 0) {
                break;
            }
            if(maxScores < score){
                maxScores = score;
            }
            Integer score1 = new Integer(score);
            v.addElement(score1);

        }
        for (int i = 0; i <v.size();  i++) {
           Integer score =(Integer) v.elementAt(i);
           String level;
           if(maxScores - score <= 10){
               level = "A";
           }else if (maxScores - score <= 20){
               level = "B";
           }else if (maxScores - score <= 30){
               level = "C";
           }else{
               level = "D";
           }
            System.out.println("学生成绩为：" + score + ",等级为："+ level);
        }

        }
    }


