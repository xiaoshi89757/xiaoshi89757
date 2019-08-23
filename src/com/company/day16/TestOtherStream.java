package com.company.day16;

import org.junit.Test;

import java.io.*;

public class TestOtherStream {

    @Test
    public void DataInputStream(){
        DataInputStream dis =null;
        try {
            dis =new DataInputStream(new FileInputStream("data.txt"));
            String str = dis.readUTF();
            System.out.println(str);
            boolean b = dis.readBoolean();
            System.out.println(b);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dis != null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    //数据流 ； 用来处理基本数据类型 String 字节数组的数据 DataInputStream DataOutputStream
    @Test
    public void testData(){
        DataOutputStream dos = null;
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            dos = new DataOutputStream(fos);

            dos.writeUTF("我爱你而你却不知道");
            dos.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //打印流 ； 字节流 PrintStream 字符流 PrintWriter
    @Test
    public void printStreamWriter(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("print.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintStream ps = new PrintStream(fos,true);
        if (ps != null){
            System.setOut(ps);
        }
        for (int i = 0; i <=255; i++) {
            System.out.print(i);
            if (i % 50 ==0){
                System.out.println();
            }
        }
        ps.close();
    }
}
