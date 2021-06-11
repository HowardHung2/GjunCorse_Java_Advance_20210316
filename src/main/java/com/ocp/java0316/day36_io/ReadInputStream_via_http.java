package day36_io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadInputStream_via_http {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(path);
        InputStream is = url.openConnection().getInputStream();
        int ch = 0;
        while ((ch = is.read()) != -1) { // 讀取資料
            System.out.print(ch); // 讀取圖片數字資料
        }
    }
}
