package net.kanzler.patterns.strategy.example2;

public class FlyWings implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly...");
    }
}
