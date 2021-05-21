package net.kanzler.patterns.strategy.example2;

public abstract class Duck implements Flyable{
    Flyable flyable;

    @Override
    public void fly() {
        flyable.fly();
    }
}
