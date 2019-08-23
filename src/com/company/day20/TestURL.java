package com.company.day20;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//url:统一资源定位符，一个url的对象，对应着互联网上的一个资源
//我们可以通过url的对象调用其相应的方法，将此资源读取下载
public class TestURL {
    public static void main(String[] args) throws Exception {
        //1.创建一个url的对象
        URL url = new URL("http://www.baidu.com");
        System.out.println(url.getProtocol()); //获取url的协议名
        System.out.println(url.getHost());  //获取主机名
        System.out.println(url.getPort());  //获取端口号
        System.out.println(url.getPath());  //获取url文件路径
        System.out.println(url.getFile());  //获取url的文件名
        System.out.println(url.getRef());   //获取url在文件中的相对位置
        System.out.println(url.getQuery()); //获取url的查询名
        //如何将服务端的数据读取进来
        InputStream inputStream = url.openStream();
        byte[] b = new byte[20];
        int len;
        while ((len = inputStream.read(b)) != -1){
            System.out.println(new String(b,0,len));

        }
        inputStream.close();

    }
    @Test
    public void test1(){
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();
            inputStream = urlConnection.getInputStream();
            fileOutputStream = new FileOutputStream(new File("test.txt"));
            byte[] b = new byte[24];
            int len;
            while ((len = inputStream.read(b)) != -1){
                fileOutputStream.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
        }


    }
}
