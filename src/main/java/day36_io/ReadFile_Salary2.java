package day36_io;

import java.io.File;
import java.io.FileReader;
import jdk.jfr.events.FileReadEvent;

public class ReadFile_Salary2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day36_io/files/salary.txt");
        
        // try-with-resource(自動關閉檔案)
        try(FileReader fr = new FileReader(file)) { // 有實作 Closeable 的類才可以放入try()的()內
            int ch = 0;
            while ((ch=fr.read()) != -1) {
                System.out.println((char)ch);
                
            }
        } catch (Exception e) {
        }
        
    }
}
