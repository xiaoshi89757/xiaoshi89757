package com.company.day16;


import org.junit.Test;

import java.io.*;

public class test {
    @Test
    public void test3(){
        BufferedReader br =null;
        BufferedWriter bw =null;
        try {
            br = new BufferedReader(new FileReader("test1.txt"));
            bw = new BufferedWriter(new FileWriter("test2.txt"));
           char[] c= new char[20];
           int len;
           while ((len = br.read(c)) != -1){
               bw.write(c, 0, len);
               bw.flush();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Test
    public void test2(){
        BufferedWriter bw =null;
        try {
            bw = new BufferedWriter(new FileWriter(new File("test1.txt")));
            String str = "java 是一种可以撰写平台应用的软件的面向对象的程序设计语言test2";
            bw.write(str);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test() {
        FileOutputStream fos = null;
        try {
            File file = new File("test.txt");
            fos = new FileOutputStream(file);
            fos.write(new String("java 是一种可以撰写平台应用的软件的面向对象的程序设计语言").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test1() {
        File file1 = new File("test1.txt");
        File file2 = new File("test3.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            byte[] b = new byte[5];
            int len;
            while ((len = fis.read(b)) != -1) {
              /*  for (int i = 0; i < len; i++) {
                    System.out.println((char) b[i]);
                }*/
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}

