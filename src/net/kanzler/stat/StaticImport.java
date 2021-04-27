package net.kanzler.stat;

import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        System.out.println(sqrt(5));

        double x = sqrt(5) + pow(1,5) + abs(-5);
        System.out.println(x);
    }
}
