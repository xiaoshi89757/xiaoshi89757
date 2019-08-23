package com.company.day11;



public class TestUSB {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.doWork(new Printer());
        //实现接口匿名类的对象
        USB Phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止连接");
            }
        };
        com.doWork(Phone);
    }


}
class Computer{
    public void doWork(USB usb){
        usb.start();
        System.out.println("此设备开始操作");
        usb.stop();
    }
}
interface USB{

    void start();
    public abstract void stop();
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("开始工作");
    }

    @Override
    public void stop() {
        System.out.println("停止工作");
    }
}