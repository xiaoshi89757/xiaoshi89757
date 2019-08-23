package com.company.day14;
    /*
    * 一.枚举类
    * 1.如何自定义枚举类
    * 2.如何使用enum关键字定义枚举类
    *   >常用的方法 values() 以数组的方式返回所有对象
    *   >如何让枚举类实现接口 可以让不同的枚举类调用被重写的抽象方法 相当于每个对象重写抽象方法
    *   每个对象调用的抽象方法不一样
    *
    * */
public class TestSeason1 {
    public static void main(String[] args) {
        Season1 spring = Season1.WINTER;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());
        //1.values()
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }
        //2.valueOf(String name) 要求传入的形参name是枚举类对象的名字 否则报异常
        String str = "SPRING";
        Season1 sea = Season1.valueOf(str);
        System.out.println(sea);

        Thread.State[] states = Thread.State.values();

        for (int j = 0; j <states.length ; j++) {
            System.out.println(states[j]);
        }
    }
}
interface info{
    void show();
}
//枚举类
enum  Season1 implements info{
    SPRING("spring", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("summer", "夏暖花开"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("autumn", "秋暖花开"){
        @Override
        public void show() {
            System.out.println("落叶");
        }
    },
    WINTER("winter", "冬暖花开"){
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };
    //1.提供类的属性 声明为 private final
    private final String seasonName;
    private final String seasonDesc;
    //2.声明为final的属性 在构造器中初始化
    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.通过公共的方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.创建枚举类的对象 : 将类的对象声明为public static final

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
    public void show(){
        System.out.println("这是一个季节");
    }
}
