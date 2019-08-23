package com.company.day15;

import org.junit.Test;

import java.io.*;

public class TestBuffered {
    @Test
    public void testBufferedReader(){
      //  BufferedReader br 的新的方法 readLine() 一下输出一行
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File file = new File("89757.txt");
            File file1 = new File("999.txt");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file1);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            /*char[] c  =new char[1024];
            int len;
            while ((len = br.read(c)) != -1){
                String  str = new String(c, 0, len);
                System.out.print(str);
            }*/
            String str;
            while ((str = br.readLine()) !=null){
                bw.write(str);
                bw.newLine();
                //不会自动换行 需要newLine() 重新另起一行
                bw.flush();
              /*  System.out.println(str);*/
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
    //使用BufferedInputStream 和BufferOutputStream实现文本复制
    @Test
    public void testBufferedInputOutputStream(){
        //1.提供读入 写出的文件
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file1 = new File("1.jpg");
            File file2 = new File("2.jpg");
            //2.创建相应的节点流 FileInputStream FileOutputStream
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            //3.将穿件的节点流的对象作为形参传递给缓冲流的构造器中
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //4.具体的文件复制
            byte[] b = new byte[1024];
            int len;
            while ((len = bis.read(b)) != -1){
                bos.write(b, 0, len);
                bos.flush();
                //BufferedOutputStream 和BufferedWriter 写入之后后面都加一个flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
