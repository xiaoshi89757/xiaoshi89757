package com.company.Day18;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* 与时间相关的类
* 1.System 类下的currentTimeMillis()
* 2.Date类 java.util.Date以及子类java.sql.Date
* 3.SimpleDateFormat类
* 4.Calendar类
*
* */
public class TestDate {
    //日历 Calendar get /add /set /Date getTime /setTime(Date d)
    @Test
    public void test4(){
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
    /*
    * “三天打鱼 两天晒网” 1990-01-01 xxxx-xx-xx 打渔 ？ 晒网？
    * */
    public  int getDay(String date1,String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(date1);
        Date d1 = sdf.parse(date2);
        long milliTime = d1.getTime() - d.getTime();
        return (int)milliTime/1000/3600/24 +1;
    }
    @Test
    public void test3(){

    }

    /*
    * java.test.SimpleDateFormat类易于国际化
    * 格式化 日期---> 文本   使用SimpleDataFormat()中的format()
    *
    * */
    @Test
    public void test2() throws ParseException {
        //1.格式化
        SimpleDateFormat sdf = new SimpleDateFormat();
        String str  = sdf.format(new Date()); //2019/7/19 下午3:31
        System.out.println(str);
        //2.格式化2
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str1 = sdf1.format(new Date());
        System.out.println(str1);


        Date date1 = sdf.parse("2019/7/19 下午3:31");
        System.out.println(date1);

    }
    //java.util.Date不易于国际化
    @Test
    public void test1() {
        Date d1 = new Date();
        System.out.println(d1.toString());
        System.out.println(d1.getTime()); //获取的是一个L型的值
//        java.sql.Date d2 = new java.sql.Date(1563519785921L);
        Date d2 = new Date(1563519785921L);
        System.out.println(d2);

    }
}
