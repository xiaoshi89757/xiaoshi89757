package com.company.day8;
//子类对象的实例化过程
public class TestDog {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.setAge(10);
        d.setName("花花");
        d.setHostName("小明");

        System.out.println("name:" + d.getName() + "age:" + d.getAge() + "hostName:" + d.getHostName());
    }
}
//生物
class Creator{
    private int age;

    public Creator(){
        super();
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//动物
class Animal extends Creator{
    private String name;

    public Animal(){
        super();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dogs extends Animal{
    private String hostName;

    public Dogs(){
        super();
    }
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
