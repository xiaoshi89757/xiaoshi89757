package com.company.day14;

import java.util.*;

public class DAO<T> {
    Map<String,T> map = new HashMap<>();
    public void save(String id ,T entity){
        map.put(id, entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id , T entity){
        map.put(id, entity);
    }
    public void delete(String id){
        map.remove(id);
    }
    public List<T>list() {
        List<T> list = new ArrayList<>();
        for (T t : map.values()) {
            list.add(map.get(t));
        }
        return list;
    }
    /*public void add(T t){

    }
    public T get (int index){
        return null;
    }
    public List<T> getForList(int index){
        return null;
    }
    public void delete(int index){
    }
*/

}
