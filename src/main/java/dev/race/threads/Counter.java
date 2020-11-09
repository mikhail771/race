package dev.race.threads;

public class Counter {
    private static final int LIMIT = 100;
    private int value;

    public int increment() {
        return value++;
    }

    public boolean isLimitReached() {
        return value < LIMIT;
    }
}
