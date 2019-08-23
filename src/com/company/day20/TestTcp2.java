package com.company.day20;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//客户端给服务端发送信息，服务端将信息打印到控制台上 同时发送已收到信息给客户端
public class TestTcp2 {
    //客户端
    @Test
    public void client(){
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            socket = new Socket("127.0.0.1", 8989);
            outputStream = socket.getOutputStream();
            outputStream.write("我是客户端".getBytes());
            //shutdownOutput() 执行此方法 显式的告诉服务端发送完毕
            socket.shutdownOutput();
            inputStream = socket.getInputStream();
            byte[] b = new byte[20];
            int len;
            while ((len = inputStream.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    //服务端
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream =null;
        try {
            serverSocket = new ServerSocket(8989);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            byte[] b = new byte[20];
            int len;
            while ((len = inputStream.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }
            outputStream = socket.getOutputStream();
            outputStream.write("已经收到信息".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream !=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
