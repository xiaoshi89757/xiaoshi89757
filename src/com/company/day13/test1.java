package com.company.day13;


import java.util.*;

public class test1 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("AA", 100);
        map.put("BB", 74);
        map.put("AV", 23);
        map.put("JI", 44);
        map.put("GU", 56);
        map.put("SUN", 98);
        map.put("MAP", 76);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
                entrySet);
        for (Map.Entry<String, Integer> temp : list)
        System.out.println(temp);// 未排序的结果  
        System.out.println("--------------------");
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }

        });
        for (int i = 0; i <3 ; i++) {
            System.out.println(list.get(i).getKey());
        }


    }
}
