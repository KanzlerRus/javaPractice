package net.kanzler.patterns.strategy.example1;

public class Developer {
    private Activity activity;

    public Developer() {
        activity = new Sleeping();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void info() {
        activity.justDoIt();
    }
}
