package com.company.day20;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUDP {
    //发送端
    @Test
    public void send(){
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            byte[] b = "你好，我是要发送的数据".getBytes();
            //创建一个数据报，每一个数据报不能大于64K，都记录着数据信息，发送端的Ip,端口号，
            DatagramPacket datagramPacket = new DatagramPacket(b, 0, b.length, InetAddress.getByName("127.0.0.1"), 9090);
            datagramSocket.send(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null){
                try {
                    datagramSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void receive(){
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(9090);
            byte[] b = new byte[24];
            DatagramPacket datagramPacket = new DatagramPacket(b, 0, b.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }

    }
}
