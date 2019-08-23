package com.company.day19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理的使用
interface Subject{
    void action();
}
//被代理类
class RealSubject implements Subject{
    @Override
    public void action() {
        System.out.println("我是被代理类 记得要执行我");
    }
}
class MyInvocationHandler implements InvocationHandler{
    Object obj;//实现了接口被代理类的对象的声明
    //1.给被代理的对象实例化 2.返回一个代理类的对象
    public Object blind(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces() ,this );
    }
    //当通过代理类的对象发起被重写的方法调用时，都会转换为如下的invoke方法的调用

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj,args);
        return returnVal;
    }

    //method方法的返回值是returnVal

}
public class TestProxy {
    public static void main(String[] args) {
        //1。创建一个被代理类的对象
        RealSubject rs = new RealSubject();
        //2.创建一个实现了InvocationHandler接口的类的对象
        MyInvocationHandler handler = new MyInvocationHandler();
        //3.调用blind()方法，动态的返回了一个同样实现了rs所在类实现的接口Subject的代理类的对象
        Object obj = handler.blind(rs);
        Subject subject = (Subject)obj; //此时sub就是代理类的对象

        subject.action();//转到对InvocationHandler接口的实现类的invoke()方法的调用

        com.company.day19.NikeClothFactory nike = new com.company.day19.NikeClothFactory();
        com.company.day19.ClothFactory clothFactory = (com.company.day19.ClothFactory) handler.blind(nike);
        clothFactory.productCloth();
    }
}
