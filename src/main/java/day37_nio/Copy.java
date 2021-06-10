package day37_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src/main/java/day36_io/files/car.jpg"); // 來源端
        Path dest = Paths.get("src/main/java/day37_nio/car.jpg"); // 目的端
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING); // StandardCopyOption.REPLACE_EXISTING -> 原本目的端已有檔案則取代
        
    }
}
