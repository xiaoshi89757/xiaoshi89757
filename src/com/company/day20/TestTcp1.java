package com.company.day20;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//客户端给服务端发消息 服务端输出此信息到控制台上
//网络编程其实就是Socket编程
public class TestTcp1 {
    //客户端
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        try {
            //1.闯将一个Socket的对象，通过构造器指明服务端的IP地址以及接收的端口号
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            //2.getOutputStream() 发送数据 方法返回OutputStream的对象
            os = socket.getOutputStream();
            //3.具体的输出过程
            os.write("我是客户端，请多关照".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭相应的流和Socket
            if (os != null){
                try {
                    os.close();
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

        }
    }
    //服务端
    @Test
    public void server(){
        ServerSocket ss = null;
        Socket s = null;
        InputStream inputStream = null;
        try {
            //1.创建一个ServerSocket的对象，通过构造器指明自身的端口号
            ss = new ServerSocket(9090);
            //2.调用accept()方法 返回一个Socket的对象
            s = ss.accept();
            //3.调用Socket对象的getInputStream()获取一个从客户端发送过来的输入流
            inputStream = s.getInputStream();
            //4.对获取的输入流进行的操作
            byte[] b = new byte[20];
            int len;
            while ((len = inputStream.read(b)) !=-1){
                System.out.println(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭相应的流 以及Socket ServerSocket的对象
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
