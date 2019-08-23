package com.company.day11;


import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* 如何处理Exception
* java提供的是异常处理的抓抛模型
*  1.  抛 执行代码时，一旦出现异常，就会在异常的代码处生成一个对应的异常类型的对象
*  并将此对象抛出  一旦抛出此异常类的对象，那么程序就会中止执行，异常类的对象抛给
*  方法的调用者  自动、手动
*
*  2.  抓 ：抓住上一步抛出来的异常类的对象， 如何抓 是异常处理的方法 java 有两种
*   处理方式一：
*   try{
*   //可能出现异常的代码
*   }catch(Exception e1){
*   处理的方式1
*   }catch(Exception e2){
*   处理的方式2
*   }finally{
*   //一定要执行的代码
*   }
*
*   try内声明的变量是类似于局部变量
*   finally是可选的
*   catch语句内是对异常对象的处理： getMessage(); printStackTrace();
*   如果异常处理了，其后的代码继续执行 如果有多个catch语句 执行完第一个其后的跳出不执行
*   tay catch 可以嵌套的
* */
public class TestException1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
            System.out.println(i);

        } catch(InputMismatchException e ){
            //System.out.println("输入的类型不匹配");

           System.out.println(e.getMessage());
        }finally{
            try {
                System.out.println("管你真猛");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

          //  e.printStackTrace();
//            try {
//                int j = 12;
//                System.out.println(j);
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//        }
//        try {
//            int[] i = new int[10];
//            System.out.println(i[-10]);
//        }catch(Exception e){
//            System.out.println("出现异常");
//        }
   }
}