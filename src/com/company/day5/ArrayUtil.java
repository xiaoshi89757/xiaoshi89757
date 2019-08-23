package com.company.day5;

import java.util.Arrays;

public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return  max;
    }
    //求数组的最小值
    public  int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return  min;
    }
    //遍历数组元素
    public void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + "/t");
        }

    }
    //求数组的平均数
    public int avg(int[] arr){
        int sum = getSum(arr);
        return  sum/arr.length;
    }
    //求数组的总和
    public int getSum(int[] arr){
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return  sum;
    }
    //数组的反转
    public int[] reverse(int[] arr){
        for (int i = 0,j = arr.length -1; i <j ; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //数组的复制
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i] = arr[i];
        }
        return arr;
    }
    //对数组进行排序
    public int[] sort(int[] arr){
        Arrays.sort(arr);
        return null;
    }
}
