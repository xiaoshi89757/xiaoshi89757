package com.company.day20;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.Object;

interface Human{
    void info();
    void fly();
}
class SuperMan implements Human{
    @Override
    public void info() {
        System.out.println("123");
    }

    @Override
    public void fly() {
        System.out.println("456");
    }
}

class MyInvocationHandler1 implements InvocationHandler {
    Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object build(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj, args);
        return returnVal;

    }
}
class MyProxy{
    //动态创建一个代理类的对象
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler1 handler = new MyInvocationHandler1();
        handler.setObj(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces() ,handler );
    }
}
public class TestAOP {
    public static void main(String[] args) {
        SuperMan man = new SuperMan(); //1.创建一个呗代理类的对象
        Object obj = MyProxy.getProxyInstance(man);
        Human hu = (Human)obj;
        hu.info();
        System.out.println();
        hu.fly();
    }
}
