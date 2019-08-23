package com.company.Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestString1 {
    public static void main(String[] args) {
        String str = "    abe  de   ";
        String str1 = myTrim(str);
        //System.out.println(str1);
        String str2 = "abcdefgabdeabfffab";
        String str3 = reverseString(str2, 3, 5);
        String str4 = str2 + str3;
        System.out.println(str3+"---------");
       // System.out.println(str4);
        String str5 = "ab";
        System.out.println(getTime(str2, str5));
        List list = getMaxSubString("abcedcvhellobnm", "abcwerthelloyuiodefabced");

        System.out.println(list);
        System.out.println(sort(str2));
    }
    //5.对字符串中字符进行自然顺序排序
    public static String sort(String str){
        if (str != null){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }
        return null;
    }
    //4.获取两个字符串中最大相同子串 比如 str1 = "abcwerthelloyuiodef";str2="cvhellobnm"
    public static List<String> getBIG(String str1 ,String str2){
        String Maxstr = ( str1.length()>str2.length())?str1:str2;
        String Minstr = ( str1.length()>str2.length())?str2:str1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i <=Minstr.length() ; i++) {
            for (int j = 0,m = Minstr.length() -i; j <=Minstr.length() ; j++,m++) {
                String str = Minstr.substring(j, m);
                if (Maxstr.contains(str)){
                    list.add(str);
                }
            }
            if (list != null){
                return list;
            }
        }
        return null;
    }


















    public static List<String> getMaxSubString(String str1 , String str2){
        String maxStr = (str1.length()>str2.length())? str1: str2;
        String minStr = (str1.length()<str2.length())? str1: str2;
        int len = minStr.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <len ; i++) {
            for (int j = 0,y = len -i; y <=len ; j++,y++) {
                String str = minStr.substring(j, y);
                if (maxStr.contains(str)){
                    list.add(str);
                }
            }
            if (list.size() != 0){
                return list;
            }
        }
        return null;
    }
    //3.获取一个字符串在另一个字符串中出现的次数 判断str2 在str1中出现的次数
    public static int getTime(String str1, String str2){
        int count = 0;
        int temp = 0;
        while ((temp = str1.indexOf(str2, temp)) != -1){
            count++;
            temp += str2.length();
        }
        return count;
    }
    //2.将一个字符串进行反转，将字符串中指定部分进行反转 比如讲"abcdefg"反转为"abfedcg"
    public static String reverseString(String str ,int start,int end) {
        if (str != null) {
            String str1 = str.substring(0, end);
            for (int i = end; i >=start ; i--) {
                str1 =str1+ str.charAt(i) ;
            }
            str1 += str.substring(end +1);
            return str1;
        }
        return null;
    }
    public  static String revers1(String str ,int startIndex,int endIndex) {
        if (str != null && str.length() != 0) {
            char[] c = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            return new String(c);
        }
        return null;
    }
    /*char[] c = new char[str1.length()];
          char[] b = new char[0];
          int d = c.length - 1;
          int i = 0;
          while (str != null && d >= i) {
              c[i] = b[0];
              c[d] = c[i];
              c[d] = b[0];
              i++;
              d--;
          }
          return str1;*/
    //1.模拟一个trim方法，去除掉字符串两边的空格
    public static String myTrim(String str){
        int start = 0;
        int end = str.length() -1;
        while(start<end &&str.charAt(start) == ' '){
            start++;
        }
        while(start<end &&str.charAt(end) == ' '){
            end--;
        }
        return str.substring(start, end+1);
    }

    // 方式二

}


