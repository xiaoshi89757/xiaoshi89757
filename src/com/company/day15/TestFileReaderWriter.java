package com.company.day15;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*使用FileReader FileWriter 可以实现文本文件的复制
* 对于非文本文件（视频文件 音频文件 图片） 只能使用字节流文件 FileInputStream FileOutputStream
* */
public class TestFileReaderWriter {

    @Test
    public void testFileReaderWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File src = new File("89757.txt");
            File dest = new File("12345.txt");

            fr = new FileReader(src);
            fw = new FileWriter(dest);

            char[] c = new char[24];
            int len;
            while ((len = fr.read(c))!= -1){
                fw.write(c, 0, len);
            }

        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testFileReader(){
        FileReader fr = null;
        try {
            File file = new File("89757.txt");
            fr = new FileReader(file);

            char[] c = new char[24];
            int len;
            while((len = fr.read(c)) != -1){
                String str = new String(c, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr !=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
