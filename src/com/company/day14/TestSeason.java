package com.company.day14;

public class TestSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());
    }
}
//枚举类
class  Season{
    //1.提供类的属性 声明为 private final
    private final String seasonName;
    private final String seasonDesc;
    //2.声明为final的属性 在构造器中初始化
    public Season(String seasonName, String seasonDesc) {
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
    public static final Season SPRING = new Season("spring", "春暖花开");
    public static final Season SUMMER = new Season("summer", "夏暖花开");
    public static final Season AUTUMN = new Season("autumn", "秋暖花开");
    public static final Season WINTER = new Season("winter", "冬暖花开");
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
