package net.kanzler.patterns.strategy.example1;

public class Reading implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
