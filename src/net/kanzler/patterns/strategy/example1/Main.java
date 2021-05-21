package net.kanzler.patterns.strategy.example1;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.info();

        developer.setActivity(new Reading());
        developer.info();

        developer.setActivity(new Sleeping());
        developer.info();
    }
}
