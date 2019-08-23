package com.company.day13;


import java.util.*;

public class testHashSet {
    public static void main(String[] args) {
        /*
        * 定制排序
        *
        *   向TreeSet 中添加Customer类的对象 在此compare()方法中 指明是按照Customer的哪个属性排序的
        * */
        //1.创建一个实现了Comparetor 接口的类对象
            Comparator com = new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    if (o1 instanceof com.company.day13.Customer && o2 instanceof com.company.day13.Customer){
                        com.company.day13.Customer c1 = (com.company.day13.Customer)o1;
                        com.company.day13.Customer c2 = (com.company.day13.Customer)o2;
                        return c1.getAge().compareTo(c2.getAge());
                    }
                    return 0;
                }
            };
            //2.将此对象作为形参传递给TreeSet的构造其中
          TreeSet tree = new TreeSet(com);
             //3.向TreeSet中添加Comparator 中的compare 方法涉及的类的对象
          tree.add(new com.company.day13.Customer("AA",1003));
          tree.add(new com.company.day13.Customer("Ac",1004));
          tree.add(new Customer("Ad",1005));
        for (Object obj: tree
             ) {
            System.out.println(obj);
        }
        /*
        * TreeSet必须添加的元素是一个类的
        * 可以按照添加进集合中的元素的指定的顺序遍历 String 包装类等默认按照从小到大
        *     Person类中没有实现Comparable接口的compareTo方法时 报错
        *     自然排序 要求自定义类实现java.lang.CompareTo接口重写compareTo（Object obj）方法
        *       在这个方法中可以自定义按照某个属性进行排序
        *
        *  TreeSet添加元素时 首先按照compareTo()进行比较 一旦返回0 虽然仅是两个对象的此属性值相同
        *  但是程序会认为两个对象是相同的 进而后一个对象就不能添加进来
        *  >compareTo() .hashCode() equals()三者保持一致
        * */
        Set set2 = new TreeSet();
        set2.add(new com.company.day13.Person("cc",23));
        set2.add(new Person("dd",24));
        /*
        * LinkedHashSet : 使用链表维护了一个添加进集合的顺序 导致我们遍历LinkedHashSet集合元素
        * 的时候 是按照添加进去的顺序是遍历的  但是还是无序的
        * */
        Set set1 = new LinkedHashSet();
        set1.add(123);
        set1.add(null);

        Iterator iterator = set1.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }

        /*
        * set 常用的方法都是collection 下定义的
        *    存储的元素是无序的 不可重复的
        *    1.无序性 无序性！=随机性  元素在底层存储的位置是无序的
        *    2.不可重复性 向Set中添加相同的元素的时候 后面的不能添加进去
        *
        *    添加set中的元素所在的类 一定要重写equals 和hashcode方法
        *    保证set中的元素的不可重复性
        *
        *    set中的元素 使用哈希算法存储
        *    添加对象时  首先调用对象所在类的hashCode方法 计算对象的哈希值 哈希值决定了
        *    存储位置 若此位置之前没有对象存储 则这个对象直接存储到此位置 若此位置有对象存储
        *    通过equals 比较两个对象是否相同 如果相同后一个对象不能添加进来
        *    >要求：hashCode()方法要与equals()方法一致
        * */
        Set set = new HashSet();
        set.add(123);
        set.add(null);//可以添加空值

    }
}
