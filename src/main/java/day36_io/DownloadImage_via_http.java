package day36_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
// Download 讀取 -> 寫檔

public class DownloadImage_via_http {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String FromPath = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(FromPath);
        String savePath = "src/main/java/com/ocp/day36_io/files/car.jpg";
        try (InputStream is = url.openConnection().getInputStream();
                FileOutputStream fos = new FileOutputStream(savePath, false);) {

            int ch = 0;
            // 邊讀邊寫
            while ((ch = is.read()) != -1) { // 邊讀 
                System.out.print(ch);
                fos.write(ch); // 邊寫
            }

        } catch (Exception e) {
        }

        //byte[] chs = new byte[is.available()]; // available()資料長度
        //is.read(chs); // 將資料寫進 chs 陣列
        //FileOutputStream fos = new FileOutputStream("src/main/java/day36_io/files/car.jpg");
        //fos.write(chs);
    }
}
