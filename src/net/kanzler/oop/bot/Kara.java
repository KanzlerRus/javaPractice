package net.kanzler.oop.bot;

import java.util.Scanner;

public class Kara {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
        printYourName();
        test();
    }

    private static void test() {
        String name = "Nick".toUpperCase();
        char[] nameChar = name.toCharArray();
        for (char el : nameChar) {
            if (el == 'N') {
                System.out.println("*       *");
                System.out.println("* *     *");
                System.out.println("*   *   *");
                System.out.println("*     * *");
                System.out.println("*       *");
            }
            if (el == 'I') {
                System.out.println("  *****  ");
                System.out.println("    *    ");
                System.out.println("    *    ");
                System.out.println("    *    ");
                System.out.println("  *****  ");
            }
            if (el == 'C') {
                System.out.println("   ****  ");
                System.out.println(" **      ");
                System.out.println(" **      ");
                System.out.println(" **      ");
                System.out.println("   ****  ");
            }
            if (el == 'K') {
                System.out.println("*   *    ");
                System.out.println("*  *     ");
                System.out.println("**       ");
                System.out.println("*  *     ");
                System.out.println("*    *   ");
            }
        }
    }

    private static void printYourName() {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
    }

    private static void greeting() {
        System.out.println("My name is Kara.");
    }
}