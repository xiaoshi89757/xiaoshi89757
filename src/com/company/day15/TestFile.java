package com.company.day15;

import java.io.File;
import java.io.IOException;


/*
* java.io.file
* 1.凡是与输出 输入相关的类 接口等都定义在java.io包下
* 2.File是一个类 可以有构造器创建其对象 此对象对应着一个文件（.txt .avi .doc .ppt .mp3 . jpg）或文件目录
* 3.File类对象是与平台无关的
* 4.File中的方法 仅涉及到如何创建 删除 重命名等 涉及文件内容File无能为力 由io流完成
* 5.File类的对象常作为io流具体类的构造器的形参
* */
public class TestFile {
    public static void main(String[] args) throws IOException {

        /*
        * 路径：
        *  绝对路径：包括盘符在内的完整的文件路径
        *  相对路径：在当前文件目录下的文件的路径
        *
        *   getName()
        *   getPath()
        *   getAbsoluteFile() 绝对文件名
        *   getAbsolutePath() 绝对路径
        *   getParent() 获取上一层文件
        *   renameTo(File newName)
        *
        * */
        File file1 = new File("f:/helloworld.txt");
        if(file1.exists()){
           boolean b =  file1.createNewFile();
            System.out.println(b);
        }
        File file2 = new File("hello1.txt");
        /*
        * createNewFile()
        * delete()
        * mkDir()  创建一个文件目录 只有在上一层目录真实存在的时候可以创建返回true
        * mkDirs() 可以直接创建 上层目录不存在 一并创建
        * list()
        * listFiles()
        * */
        File file3 = new File("f:/io");
        @SuppressWarnings("unuesd")
        String[] str = file3.list();
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);
        }

        File[] files =file3.listFiles();
        for (int i = 0; i <files.length ; i++) {
            System.out.println(files[i].getName());
        }

        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getParent());

        System.out.println();

        System.out.println(file3.getName());
        System.out.println(file3.getPath());
        System.out.println(file3.getAbsoluteFile());
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getParent());

        //renameTo(File newName)
        //file1.renameTo(file2) file1重命名为file2 要求 file1一定存在 file2一定不存在
        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }
}
