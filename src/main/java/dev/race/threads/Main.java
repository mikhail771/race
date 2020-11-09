package dev.race.threads;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadOne firstThread = new ThreadOne(counter);
        ThreadTwo secondThread = new ThreadTwo(counter);

        firstThread.start();
        new Thread(secondThread).start();
    }
}
