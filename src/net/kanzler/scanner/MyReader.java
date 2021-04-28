package net.kanzler.scanner;

import java.io.*;

public class MyReader {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
    }

    private static void example3() {
        File file = new File("src/net/kanzler/scanner/test.txt");
        try(FileInputStream fis = new FileInputStream(file)) {
            byte[] array = new byte[20];
            System.out.println(fis.read(array));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * метод читает byte
     */
    private static void example2() {
        File file = new File("src/net/kanzler/scanner/test.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int num;
            while (-1 != (num = fileInputStream.read())) {
                System.out.print((char) num);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * метод читает char
     */
    private static void example1() {
        try(Reader reader = new FileReader("src/net/kanzler/scanner/test.txt")){
            int num;
            while (-1 != (num = reader.read())) {
                System.out.print((char)num);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
