package net.kanzler.patterns.strategy.example2;

public class Main {
    public static void main(String[] args) {
        Duck duckFly = new DuckFly();
        Duck duckFlyNo = new DuckNoFly();

        duckFly.fly();
        duckFlyNo.fly();
    }
}
