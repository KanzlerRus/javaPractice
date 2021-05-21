package net.kanzler.patterns.strategy.example2;

public class DuckNoFly extends Duck{

    public DuckNoFly() {
        flyable = new FlyNo();
    }

}
