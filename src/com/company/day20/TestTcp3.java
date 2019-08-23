package com.company.day20;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//从客户端发送文件给服务端 服务端保存到本地 并返回发送成功给客户端 关闭比较快美奴；会尽快怒l.hijkmnu；。
public class TestTcp3 {
    //客户端
    @Test
    public void client(){
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream outputstream = null;
        InputStream inputStream = null;
        try {
            socket = new Socket("127.0.0.1", 9999);

            fis = new FileInputStream(new File("微信图片_20190820084013.jpg"));
            outputstream = socket.getOutputStream();
            byte[] b = new byte[20];
            int len;
            while((len = fis.read(b)) !=-1){
                outputstream.write(b,0,len);
            }
            socket.shutdownOutput();
           inputStream = socket.getInputStream();
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
            if (outputstream != null){
                try {
                    outputstream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
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
    @Test
    public void server(){
        ServerSocket serverSocket =null;
        Socket socket =null;
        InputStream inputStream =null;
        FileOutputStream fileOutputStream =null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("2.jpg"));
            byte[] b = new byte[1024];
            int len;
            while((len = inputStream.read(b)) != -1){
                fileOutputStream.write(b, 0, len);
            }
            outputStream = socket.getOutputStream();
            outputStream.write("你的图片我接收成功".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
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
