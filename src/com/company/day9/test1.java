package com.company.day9;

import java.util.Objects;

public class test1 {
    public static void main(String[] args) {
        Order o = new Order();
    }
}
class Order {
    private int drderld;
    private String OrderName;

    public Order() {

    }

    public Order(int drderld, String orderName) {
        this.drderld = drderld;
        OrderName = orderName;
    }

    public int getDrderld() {
        return drderld;
    }

    public void setDrderld(int drderld) {
        this.drderld = drderld;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return drderld == order.drderld &&
                Objects.equals(OrderName, order.OrderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drderld, OrderName);
    }
    //手动生成的方法
    /*public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }else if (obj instanceof Order) {
            Order o1 = (Order)obj;
            return this.drderld == o1.drderld && this.OrderName.equals(o1.OrderName);
        }else {
            return  false;
        }
    }*/
}