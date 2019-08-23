package com.company.day14;

import java.util.*;


/*
* 泛型的使用
* 1>在集合中使用泛型
* 2>自定义泛型类，泛型接口 泛型方法
* 3>泛型与继承的关系
* 4>通配符
*
* */

/*
 *  静态方法终不能使用类的泛型   (实例化对象的时候才确定泛型类的属性 )
 *  如果泛型类是一个接口或者抽象类 ，不可创建泛型类的对象
 *  不能再catch中使用泛型
 *  从泛型类派生子类 泛型类型需要具体化
 *  如果一个集合中的内容限制为一个特定的数据类型 这就是generics背后的核心思想
 * */
public class TestGeneric {
    public static void main(String[] args) {
        /*
        * 通配符？
        * 可以读取声明为通配符的集合类的对象 不允许向声明为通配符的集合类中写入对象
        * List<A>..List<B> 都是List<?>的子类
        *
        * ? extends A 可以存放A及其子类
        * ？super A 可以存放A及其父类
        * */
        List<?> list7 = null;
        List<Object> list6 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();
        list7 = list6;
        list7 = list5;


        /*泛型与继承的关系
               若类A时类B的子类 那么List<A>就不是List<B>的子类
           List<Object> list = null;
           List<String> list1 = new ArrayList<String>();
           list = list1;
           假设list = list1 满足  把list1的地址值赋给了list
           list.add(123);
           String str = list1.get(o);
        */


        //自定义泛型的使用 实例化泛型类的对象时，指明泛型的类型
        // 指明以后 对应的类中所有使用泛型的位置，都变成实例化中指定的泛型的类型
        //2.如果我们自定义了泛型类 实例化时没有使用 那么默认的类型是Object
        com.company.day14.Order<Boolean> order  = new Order();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        List<Boolean> list3 = order.list;
        System.out.println(list3);
        order.getE(3.4);
        //当通过对象调用泛型方法时，指明类型

        Integer i = order.getE(34);
        Double d = order.getE(2.3);

        Integer[] in = new Integer[]{1,2,3};
        List<Integer> list4 = new ArrayList<>();
        order.fromArrayToList(in, list4);
        System.out.println(list4);

        //在集合中没有使用泛型的情况下
        List list = new ArrayList();
        list.add(89);
        list.add(77);
        list.add(57);
        //1.没有使用泛型 任何Object及子类的对象都可以添加进来
        //list.add(new String("aa"));

        for (int m = 0; m <list.size() ; m++) {
            //2.强转为int型时 报异常ClassCastException
            Integer score = (Integer)list.get(m);
            //System.out.println(score);
        }

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(78);
        list1.add(88);
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("AA", 78);
        map.put("BB", 88);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for (Map.Entry<String,Integer> obj :set){
            System.out.println(obj.getKey() + "----" + obj.getValue());
        }
    }
}
