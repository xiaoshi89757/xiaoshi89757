package com.company.day11;

public class TestProduct {
    public static void main(String[] args) {
        TestProduct t = new TestProduct();
        //创建一个实现Product接口类的对象  将此对象传入方法中
        NoteBook n = new NoteBook();
        t.show(n);
        Product p =new Product() {
            @Override
            public void getName() {

            }

            @Override
            public void getPrice() {

            }
        };
        //3.创建一个实现Product接口类的匿名类的匿名对象
        t.show(new Product() {
            @Override
            public void getName() {

            }

            @Override
            public void getPrice() {

            }
        });

    }
    public void show(Product p){
        p.getName();
        p.getPrice();
    }
}
interface Product{
    void getName();
    void getPrice();

}
class NoteBook implements Product{
    @Override
    public void getName() {
        System.out.println("hp笔记本");
    }

    @Override
    public void getPrice() {
        System.out.println("5000rmb");
    }


}