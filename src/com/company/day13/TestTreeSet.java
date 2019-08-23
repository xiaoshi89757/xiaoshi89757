package com.company.day13;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof com.company.day13.Mydate && o2 instanceof com.company.day13.Mydate){
                    com.company.day13.Mydate m1 = (com.company.day13.Mydate)o1;
                    com.company.day13.Mydate m2 = (com.company.day13.Mydate)o2;
                   return m1.compareTo(m2);
                }
                return 0;
            }
        };
        TreeSet treeSet = new TreeSet();
        com.company.day13.Employee e1 = new com.company.day13.Employee("刘",23,new com.company.day13.Mydate(2,5,1996));
        com.company.day13.Employee e2 = new com.company.day13.Employee("管",24,new com.company.day13.Mydate(2,5,1995));
        com.company.day13.Employee e3 = new com.company.day13.Employee("文",20,new com.company.day13.Mydate(2,5,1999));
        com.company.day13.Employee e4 = new com.company.day13.Employee("胆",21,new com.company.day13.Mydate(2,5,1998));
        com.company.day13.Employee e5 = new Employee("帅",29,new Mydate(2,5,1990));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);


        Iterator i = treeSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
