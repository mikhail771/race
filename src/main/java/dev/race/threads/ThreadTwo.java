package dev.race.threads;

import org.apache.log4j.Logger;

public class ThreadTwo implements Runnable {
        private static final Logger logger = Logger.getLogger(ThreadTwo.class);
        private final Counter counter;

    public ThreadTwo(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            while (counter.isLimitReached()) {
                int i = counter.increment();
                logger.info("Thread two: " + i);
            }
        }
}
