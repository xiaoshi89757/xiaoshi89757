package com.company.day20;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
* 1.InetAddress 用来代表Ip地址 一个InetAddress 对象代表一个net地址
* 2.如何创建InetAddress的对象：getByName(String host)
* 3.getHostName() 获取IP地址对应的域名
*   getHostAddress
* */
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.qq.com");
        inetAddress = InetAddress.getByName("202.194.111.148");
        System.out.println(inetAddress);

        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
    }
}
