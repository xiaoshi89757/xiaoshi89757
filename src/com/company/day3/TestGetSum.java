package com.company.day3;

public class TestGetSum {
    public static void main(String[] args) {
        int[][] i = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
        int sum = 0;
        for (int j = 0; j < i.length;j++) {
            for (int k = 0; k < i[j].length; k++) {
                System.out.print(i[j][k] + "\t");
                sum += i[j][k];
            }
            System.out.println();
        }
        System.out.println("总和为：" + sum);
    }
}
