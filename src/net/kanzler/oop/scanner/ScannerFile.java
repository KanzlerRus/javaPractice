package net.kanzler.oop.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {

        // Запись в файл
        File file = new File("src/net/kanzler/scanner/test.txt");
        try(PrintWriter pw = new PrintWriter(file)){
            pw.println("Hello Friend");
            pw.println("How are you?");
            LocalDate localDate = LocalDate.now();
            pw.println(localDate);
        }catch (FileNotFoundException ex){
            System.err.println("File not found");
        }


        // Чтение из файла
        try(Scanner scanner = new Scanner(file)){
            String str = String.format("%s\n\n\n%s\n\n\ndate : %s",
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine());
            System.out.println(str);
        }catch (FileNotFoundException ex){
            System.err.println("File not found");
        }

    }
}
