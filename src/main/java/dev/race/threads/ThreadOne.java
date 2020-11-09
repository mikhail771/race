package dev.race.threads;

import org.apache.log4j.Logger;


public class ThreadOne extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadOne.class);
    private final Counter counter;

    public ThreadOne(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isLimitReached()) {
            int i = counter.increment();
            logger.info("Thread One: " + i);
        }
    }
}
