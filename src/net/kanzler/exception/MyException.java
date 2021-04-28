package net.kanzler.exception;

import java.io.IOException;

public class MyException {
    public static void main(String[] args) {
//        example1();
        try {
            example2();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void example2() throws IOException{
        IOException ex = new IOException("Something bad....");
        throw ex;
    }

    private static void example1() throws RuntimeException {
        RuntimeException ex = new RuntimeException("Something bad....");
        throw ex;
    }
}
