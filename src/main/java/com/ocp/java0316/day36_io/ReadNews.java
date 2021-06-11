package day36_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadNews {

    public static void main(String[] args) {
        String newsPath = "src/main/java/day36_io/files/news.txt";
        try(FileInputStream   fis = new FileInputStream(newsPath); //byte陣列
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 將byte陣列轉換成char陣列 可指定編碼
            BufferedReader     br = new BufferedReader(isr);) {
            
            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
        }
    }
}
