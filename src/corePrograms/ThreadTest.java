package corePrograms;

public class ThreadTest {
    public static void main(String[] args) {
        Bomb b1 = new Bomb("Bomb 1", 2500);
        Bomb b2 = new Bomb("Bomb 2", 1000);
        Bomb b3 = new Bomb("Bomb 3", 500);
        b1.start();
        b2.run();
        new Thread(b3).start();
    }
}
class Bomb extends Thread implements Runnable {
    String name;
    int timeToWait;
    public Bomb(String name, int timeToWait) {
        this.name = name;
        this.timeToWait = timeToWait;
    }
    public void run() {
        try { Thread.sleep(timeToWait);    } catch (Exception e) {    }
        System.out.println(name + " exploded");
    }
}
