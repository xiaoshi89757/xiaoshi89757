package com.company.day15;

import org.junit.Test;

import java.io.*;

/*
* 1.流的分类：
* 按照数据流向的不同 输入流 输出流
* 按照处理数据的单位的不同 字节流 字符流（处理的文本文件）
* 按照角色的不同  节点流（直接做用于文件的） 处理流
*
* 2.IO流的体系
* 抽象基类：        节点流（文件流）
* InputStream       FileInputStream
* OutputStream      FileOutputStream
* Reader            FileReader
* Writer            FileWriter
* */
public class TestFileInputOutputStream {
    @Test
    public void testCopyFile(){
        String src ="C:\\Users\\nanshenguan\\Desktop\\guanqing.txt";
        String dest = "C:\\Users\\nanshenguan\\Desktop\\guanqinghan.txt";
        copyFile(src, dest);
    }
    //实现文件复制的方法
    public  void copyFile(String src ,String dest){
        File file1 = new File(src);
        File file2 = new File(dest);
        //2.提供相应的流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //实现文件的复制
            byte[] b = new byte[5];
            int len;
            while ((len =fis.read(b)) != -1){
                //错误的写法： fos.write(b)    fos.write(b,0,b.length)
                fos.write(b, 0, len);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (fos !=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (fis !=null){
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    //从硬盘读取一个文件 并写入到另一个位置（相当于文件赋值）
    @Test
    public void testFileInputOutputStream(){
    //1.提供读入写出的文件
        File file1 = new File("C:\\Users\\nanshenguan\\Desktop\\1.jpg");
        File file2 = new File("C:\\Users\\nanshenguan\\Desktop\\2.jpg");
    //2.提供相应的流
     FileInputStream fis = null;
     FileOutputStream fos = null;
     try{
        fis = new FileInputStream(file1);
        fos = new FileOutputStream(file2);
        //实现文件的复制
         byte[] b = new byte[5];
         int len;
         while ((len =fis.read(b)) != -1){
             //错误的写法： fos.write(b)    fos.write(b,0,b.length)
            fos.write(b, 0, len);
         }
     }catch(Exception e){
         e.printStackTrace();
     }finally{
         if (fos !=null){
             try {
                 fos.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }finally {
                 if (fis !=null){
                     try {
                         fis.close();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 }
             }
         }
     }
    }
    //FileOutputStream
    @Test
    public void testFileOutputStream(){
        //1.创建一个File对象 表明要写入的文件位置
        //输出的物理文件可以不存在 当执行过程中 若不存在会自动创建 若存在会将原有的文件覆盖
        File file = new File("hello2.txt");
        //2.创建一个FileOutputStream的对象 将file的对象作为形参传递给FileOutputStream的构造器
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            //3.写入的操作
            fos.write(new String("I love China and I love world").getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //4.关闭输出流
            if (fos !=null){
                try{
                    fos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void TestFileInputStream3()  {
        FileInputStream fis = null;
        try {
            File file = new File("helloworld.txt");
            fis = new FileInputStream(file);
            byte[] b = new byte[5];  //读取的数据要写入的数组
            int len; //每次读入到byte中的字节的长度
            while ((len = fis.read(b))!= -1){
               /* for (int i = 0; i <len; i++) {
                    System.out.print((char) b[i]);
                }*/
               String str = new String(b, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis !=null)
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //使用try-catch的方式处理异常更加合理 保证流的关闭操作一定可以执行
    @Test
    public void TestFileInputStream2(){
        FileInputStream fis = null;
        try {
            //1.创建一个File类的对象
            File file = new File("helloworld.txt");
            //2.创建一个FileInputStream类的对象
            fis = new FileInputStream(file);
            //3.调用FileInputStream下面的方法
            int b;
            while ((b= fis.read()) != -1){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis !=null)
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //4.关闭相应的流

    }
    
    public static void main(String[] args) throws IOException {
        //从硬盘存在的一个文件中 读取其内容到程序中 使用FileInputStream
        //1.创建一个File类的对象
        File file = new File("helloworld.txt");
        /*if (!file.exists()){
            boolean b1 = file.createNewFile();
            System.out.println(b1);
        }*/
        //2.创建一个FileInputStream类的对象
        FileInputStream fis = new FileInputStream(file);
        //3.调用FileInputStream下面的方法
        /*
        * read() 读取文件的一个字节 ： abcdefg
        * */
        int b = fis.read();
        while (b != -1){
            System.out.print((char) b);
            b = fis.read();
        }
        //4.关闭相应的流
        fis.close();

    }
}
