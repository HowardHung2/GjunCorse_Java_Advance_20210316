package day36_io;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
    public static void main(String[] args) throws IOException {
        // 想在 day36_io 資料夾下面 建立 files 的資料夾
        File folder = new File("src/main/java/day36_io/files"); //至資料夾按右鍵Properties
        if(!folder.exists()){
            folder.mkdir(); // 建立資料夾
        }
        // 然後在 day36_io/files 資料夾下面 建立 salary.txt 的檔案
        if(folder.exists()){
            File f = new File("src/main/java/day36_io/files/salary.txt");
            if(!f.exists()){
                f.createNewFile();
            }
        }
        
        File f2 = new File("src/main/java/day36_io/files/salary.txt");
        System.out.println(f2.isDirectory()); //是否為目錄
        System.out.println(f2.isFile()); //是否為檔案
        
    }
}
