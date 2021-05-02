package net.kanzler.enumeration;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example2() {
        Season[] seasons = Season.values();
        for (Season el : seasons) {
            System.out.println(el.name());
        }
    }

    private static void example1() {
        Season season = Season.FALL;
        String str = season.name();
        System.out.println(str);

        Season season1 = Season.valueOf("FALL");
        System.out.println(season1);
    }
}
