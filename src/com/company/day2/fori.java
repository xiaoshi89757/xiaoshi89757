package com.company.day2;
        //break
       // continue 结束当次循环
        //标签 break ， continue
public class fori {
    public static void main(String[] args) {
        /*for (int i = 1; i <10 ; i++) {
            if ( i % 4 ==0){
               // break;
                continue;
            }
            System.out.println(i);
        }*/
        label: for (int i = 1; i <5; i++) {
            for (int j = 1; j <= 10 ; j++) {
                if(j % 4 == 0){
                    //break;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
