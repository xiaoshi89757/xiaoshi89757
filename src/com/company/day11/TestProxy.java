package com.company.day11;

public class TestProxy {
    public static void main(String[] args) {
        new ProxyObject().action();
    }

}
interface Object{
    void action();
}
//代理类
class ProxyObject implements Object{
    Object obj;

    public ProxyObject() {
        System.out.println("代理类创建成功");
        obj = new ObhctImpl();
    }

    @Override
    public void action() {
        System.out.println("代理类开始执行");
        obj.action();
        System.out.println("代理类执行结束");
    }

}
//被代理类
class ObhctImpl implements Object{
    @Override
    public void action() {
        System.out.println("====被代理类开始执行==");
    }
}
