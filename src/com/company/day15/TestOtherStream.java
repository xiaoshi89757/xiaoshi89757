package com.company.day15;

import org.junit.Test;


import java.io.*;
import java.util.Scanner;

public class TestOtherStream {
    /*
    *   标准的输入输出流
    *   标准的输出流：System.out
    *   标准的输入流：System.in
    * */

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String str;
            while (true){
                System.out.println("请输入字符串:");
                str = br.readLine();
                if (str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit")){
                    break;
                }
                String str1 = str.toUpperCase(); //变成大写
                System.out.println(str1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    /*
    * 如何实现字节流和字符流之间的转换
    * 转换流 InputStreamReader  OutputStreamWriter
    * 编码 字符串---> 字节数组   OutputStreamWriter
    * 解码 字节数组---> 字符串   InputStreamReader
    * */
    @Test
    public void testInputStreamReader(){
        //解码
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File file = new File("89757.txt");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "GBK");
            br = new BufferedReader(isr);
            String str ;
            File file1 = new File("test.txt");
            FileOutputStream fos = new FileOutputStream(file1);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
            bw = new BufferedWriter(osw);
            while ((str = br.readLine()) != null){
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
}
