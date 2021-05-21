package net.kanzler.patterns.strategy.example2;

public class FlyNo implements Flyable{
    @Override
    public void fly() {
        System.out.println("I cannot fly...");
    }
}
