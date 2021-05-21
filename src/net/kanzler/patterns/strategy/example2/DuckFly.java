package net.kanzler.patterns.strategy.example2;

public class DuckFly extends Duck{
    public DuckFly() {
        flyable = new FlyWings();
    }
}
