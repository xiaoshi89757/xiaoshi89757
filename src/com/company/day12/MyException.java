package com.company.day12;
/*如何自定义一个异常类
* 1.自定义的异常类继承现有的异常类
* 2.提供一个唯一的序列号，提供几个重载的构造器
* */

public class MyException extends RuntimeException {
    static final long serialVersionUID = -703489719074766939L;
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
