package net.kanzler.File;

import java.io.File;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/net/kanzler/File/text.txt");
        file.createNewFile();       // создать файл
        file.delete();              // удалить файл
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParentFile());

        System.out.println("============================");
        File file1 = new File("src/net/kanzler");
        File[] array = file1.listFiles();
        for(File el : array) {
            System.out.println(el.getName());
        }
    }
}
