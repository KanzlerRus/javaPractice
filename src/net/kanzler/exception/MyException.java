package net.kanzler.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        try{
            int x = 5 / 0;
            System.out.println(x);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Program is still work");

        File file = new File("test.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
