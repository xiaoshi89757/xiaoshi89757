package com.company.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//异常处理方式二： 在方法的声明处，显示的抛出异常对象的异常的类型
/*
* 当在此方法内部出现异常的时候，会抛出一个异常类的对象，抛给方法的调用者
* 异常的对象可以逐层向上抛，直至main中，当然在向上抛的过程中， 可以通过try-catch-finally进行处理
* */
public class TestException {
    public static void main(String[] args) {
        try {
            new TestException().method2();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch(IOException e ){
            e.printStackTrace();
        } finally {
            System.out.println("found a exception");
        }
    }
    public static void method2()throws FileNotFoundException,IOException{
        method1();
    }
    public static void method1()throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        int b;
        while ((b = fis.read()) !=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
}

