package net.kanzler.funcAPI;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example3() {
        Function<String,String> f = s -> s.toUpperCase();
        System.out.println(f.apply("test"));
    }

    private static void example2() {
        BiFunction<String,String,String> f = (s1, s2) -> s1 + s2;
        System.out.println(f.apply("test","TEST"));
    }

    private static void example1() {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("test"));
    }
}
