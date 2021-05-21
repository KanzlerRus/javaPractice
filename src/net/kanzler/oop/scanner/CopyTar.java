package net.kanzler.oop.scanner;

import java.io.*;

public class CopyTar {
    public static void main(String[] args) {
        copyTar();
    }

    private static void copyTar() {
        byte[] array = new byte[2_000_000];

        File file = new File("src/net/kanzler/scanner/test.tar");
        try(FileInputStream fis = new FileInputStream(file)) {
            int num;
            int i = 0;
            while (-1 != (num = fis.read())) {
                array[i++] = (byte)num;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File newFile = new File("src/net/kanzler/scanner/test_new.tar");
        try(FileOutputStream fos = new FileOutputStream(newFile)) {
            fos.write(array);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
